package com.test;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FIleZipDownload {

    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\win10\\IdeaProjects\\testProject\\src\\test\\resources\\source";
        String zipFilePath = "target/file.zip";
        zipDirectory(sourceFilePath, zipFilePath);
    }

    private static void zipDirectory(String sourceFolderPath, String zipFilePath) {
        try {
            // 创建 ZipOutputStream 对象，用于写入压缩文件
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFilePath));
            // 创建 File 对象，表示要压缩的目录
            File directory = new File(sourceFolderPath);
            // 获取目录下的所有文件和子目录
            File[] files = directory.listFiles();
            // 向压缩文件中添加文件和子目录
            for (File file : files) {
                zipFile(file, file.getName(), zipOut);
            }
            // 关闭 ZipOutputStream 对象，完成压缩过程
            zipOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void zipDirectoryV2(String sourceFolderPath, String zipFilePath) {
        try {
            // 创建 ZipOutputStream 对象，用于写入压缩文件
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ZipOutputStream zipOut = new ZipOutputStream(byteArrayOutputStream);
            // 创建 File 对象，表示要压缩的目录
            File directory = new File(sourceFolderPath);
            // 获取目录下的所有文件和子目录
            File[] files = directory.listFiles();
            // 向压缩文件中添加文件和子目录
            for (File file : files) {
                zipFile(file, file.getName(), zipOut);
            }
            // 关闭 ZipOutputStream 对象，完成压缩过程
            zipOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
        // 如果要压缩的是目录，则递归处理目录下的每个文件
        if (fileToZip.isDirectory()) {
            File[] files = fileToZip.listFiles();
            for (File file : files) {
                zipFile(file, fileName + "/" + file.getName(), zipOut);
            }
            return;
        }
        // 创建 ZipEntry 对象，表示要压缩的文件
        ZipEntry zipEntry = new ZipEntry(fileName);
        zipOut.putNextEntry(zipEntry);
        // 创建 FileInputStream 对象，读取要压缩的文件
        FileInputStream fileIn = new FileInputStream(fileToZip);
        byte[] buffer = new byte[1024];
        int bytesRead;
        // 将文件数据写入 ZipOutputStream 中
        while ((bytesRead = fileIn.read(buffer)) != -1) {
            zipOut.write(buffer, 0, bytesRead);
        }
        // 关闭 FileInputStream 对象
        fileIn.close();
        // 告知 ZipOutputStream 这个 ZipEntry 已结束
        zipOut.closeEntry();
    }

    private static void zipFileV2(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
        // 如果要压缩的是目录，则递归处理目录下的每个文件
        if (fileToZip.isDirectory()) {
            File[] files = fileToZip.listFiles();
            for (File file : files) {
                zipFile(file, fileName + "/" + file.getName(), zipOut);
            }
            return;
        }
        // 创建 ZipEntry 对象，表示要压缩的文件
        ZipEntry zipEntry = new ZipEntry(fileName);
        zipOut.putNextEntry(zipEntry);
        // 创建 FileInputStream 对象，读取要压缩的文件
        FileInputStream fileIn = new FileInputStream(fileToZip);
        byte[] buffer = new byte[1024];
        int bytesRead;
        // 将文件数据写入 ZipOutputStream 中
        while ((bytesRead = fileIn.read(buffer)) != -1) {
            zipOut.write(buffer, 0, bytesRead);
        }
        // 关闭 FileInputStream 对象
        fileIn.close();
        // 告知 ZipOutputStream 这个 ZipEntry 已结束
        zipOut.closeEntry();
    }

}
