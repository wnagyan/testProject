package com.test;

import java.util.ArrayList;
import java.util.Random;

public class SortTest {


    public static void main(String[] args) {
        //随机产生32个[0~3]的数字集合
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        //这里为什么是32？
        for (int i = 0; i < 32; i++) {
            list.add(random.nextInt(4));
        }
        System.out.println(list);
        list.sort((o1, o2) -> {
            //定义一个不具备自反性的Comparator
            if (o1 > o2) {
                return 1;
            }else {
                return -1;
            }
        });

        System.out.println(list);
    }


}
