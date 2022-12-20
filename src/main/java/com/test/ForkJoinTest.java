package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/**
 * RecursiveTask：有返回值
 * RecursiveAction：无返回值
 */
public class ForkJoinTest {

    private static int num[] = MakeArray.makeArray() ;
    private static final Integer POINT = num.length / 10;

    private static class ForkJoinTask extends RecursiveTask<Integer>{

        private int src[];
        private int startIndex;
        private int endIndex;

        public ForkJoinTask(int[] src, int startIndex, int endIndex) {
            this.src = src;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        protected Integer compute() {
            //不满足阈值的时候，这里面的逻辑也是当满足阈值的时候，递归执行的逻辑
            if (endIndex - startIndex < POINT) {
                int count = 0;
                for (int i = startIndex; i <= endIndex; i++) {
                    count += src[i];
//                    SleepTools.ms(1);
                }
                return count;

            //满足阈值的时候，需要分割任务，然后交给forkjoinpool去执行任务
            } else {
                //当需要分割的时候，采用折中法进行分割
                //startIndex.......mid.......endIndex
                int mid = (startIndex + endIndex) / 2;

                //左任务
                ForkJoinTask leftTask = new ForkJoinTask(src, startIndex, mid);
                //右任务
                ForkJoinTask rigthTask = new ForkJoinTask(src, mid + 1, endIndex);

                //交给forkjoinpool去执行任务
                invokeAll(leftTask, rigthTask);

                //将执行结果返回
                return leftTask.join() + rigthTask.join();
            }
        }
    }

    private static class MakeArray{
        private static Integer arrayLength = 5000;

        public static int[] makeArray(){
            Random random = new Random();

            int[] array = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++){
                array[i] = random.nextInt(arrayLength * 3);
            }
            return array;
        }
    }


    private class ForkJoinAction extends RecursiveAction{

        //要搜寻的目录
        private File dir;

        public ForkJoinAction(File dir) {
            this.dir = dir;
        }

        @Override
        protected void compute() {
            File[] files = dir.listFiles();
            if (files != null) {
                List<ForkJoinAction> list = new ArrayList<>();
                for (File file : files) {
                    //如果是目录，就需要分割任务，交给ForkJoinPool去执行，因为任务数目不确定，所以需要定义一个集合
                    if (file.isDirectory()) {
                        ForkJoinAction findFiles = new ForkJoinAction(file);
                        list.add(findFiles);

                        //不是目录，是文件就执行自己的逻辑
                    } else {
                        if (file.getAbsolutePath().endsWith("dll")) {
                            System.out.println(file.getAbsolutePath());
                        }
                    }
                }
                //如果任务
                if (list.size() > 0) {
                    Collection<ForkJoinAction> findFiles = invokeAll(list);
                    for (ForkJoinAction findFiles1 : findFiles) {
                        //等待所有的任务执行完成
                        findFiles1.join();

                        //所有的任务都执行完了才会执行
                        System.out.println(Thread.currentThread().getName() + "....join end..");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoin = new ForkJoinPool();

        //同步执行方法
//        forkJoin.invoke();

        //异步执行方法
//        forkJoin.execute();
    }
}
