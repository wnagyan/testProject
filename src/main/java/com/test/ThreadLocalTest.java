package com.test;

public class ThreadLocalTest {

    //创建一个存储Stirng类型变量的ThreadLocal
    private static ThreadLocal<String> threadLocal=new ThreadLocal<>();

    public static void main(String[] args) {

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("a");
                threadLocal.set("aa");
                System.out.println("thread1 local:"+threadLocal.get());

            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("b");
                threadLocal.set("bb");
                System.out.println("thread1 local:"+threadLocal.get());
            }
        });

        thread1.start();
        thread2.start();

        //设置主线程的ThreadLocal
        threadLocal.set("main");
        threadLocal.set("mainmain");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打印主线程的ThreadLocal变量
        System.out.println("main local:"+threadLocal.get());

    }
}