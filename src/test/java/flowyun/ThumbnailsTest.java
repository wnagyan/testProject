package flowyun;

import com.sun.management.OperatingSystemMXBean;
import net.coobird.thumbnailator.Thumbnails;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ThumbnailsTest {

    @Test
    public void test() {
        InputStream input = null;
        try {
            input = Files.newInputStream(Paths.get("D:\\文档\\极客时间\\“行星发动机全景版”海报—大图 去水印.jpg"));
            getFreeMemory();
            System.out.println("压缩前大小：" + input.available());
            InputStream finishStream = compressFile(input);
            System.out.println();
            System.out.println();
            getFreeMemory();
            System.out.println("压缩后大小：" + finishStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.gc();

    }


    private static InputStream compressFile(InputStream input) throws Exception {
        int available = input.available();
        double scale = calculateScale(available);
        if (scale == 0) {
            return input;
        }
        BufferedImage bufImg = Thumbnails.of(ImageIO.read(input)).scale(scale).asBufferedImage();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(bufImg, "jpg", bos);
        input = new ByteArrayInputStream(bos.toByteArray());
        int afterAvailable = input.available();
        //如果大小超过1MB，继续压缩
        if (afterAvailable >= 1024 * 1024) {
            compressFile(input);
        }
        return input;
    }

    private static double calculateScale(int available) {
        if (available > 10 * 1024 * 1024) {
            return 0.01;
        } else if (available > 5 * 1024 * 1024) {
            return 0.02;
        } else if (available > 3 * 1024 * 1024) {
            return 0.033;
        } else if (available > 2 * 1024 * 1024) {
            return 0.05;
        } else if (available > 1024 * 1024) {
            return 0.1;
        }

        return 0;
    }

    private void getFreeMemory(){
        // 虚拟机级内存情况查询
        long vmFree = 0;
        long vmUse = 0;
        long vmTotal = 0;
        long vmMax = 0;
        int byteToMb = 1024 * 1024;
        Runtime rt = Runtime.getRuntime();
        vmTotal = rt.totalMemory() / byteToMb;
        vmFree = rt.freeMemory() / byteToMb;
        vmMax = rt.maxMemory() / byteToMb;
        vmUse = vmTotal - vmFree;
        System.out.println("JVM内存已用的空间为：" + vmUse + " MB");
        System.out.println("JVM内存的空闲空间为：" + vmFree + " MB");
        System.out.println("JVM总内存空间为：" + vmTotal + " MB");
        System.out.println("JVM总内存空间为：" + vmMax + " MB");

        System.out.println("======================================");
        // 操作系统级内存情况查询
        OperatingSystemMXBean osmxb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        String os = System.getProperty("os.name");
        long physicalFree = osmxb.getFreePhysicalMemorySize() / byteToMb;
        long physicalTotal = osmxb.getTotalPhysicalMemorySize() / byteToMb;
        long physicalUse = physicalTotal - physicalFree;
        System.out.println("操作系统的版本：" + os);
        System.out.println("操作系统物理内存已用的空间为：" + physicalFree + " MB");
        System.out.println("操作系统物理内存的空闲空间为：" + physicalUse + " MB");
        System.out.println("操作系统总物理内存：" + physicalTotal + " MB");

        // 获得线程总数
        ThreadGroup parentThread;
        int totalThread = 0;
        for (parentThread = Thread.currentThread().getThreadGroup(); parentThread
                .getParent() != null; parentThread = parentThread.getParent()) {
            totalThread = parentThread.activeCount();
        }
        System.out.println("获得线程总数:" + totalThread);
    }
}
