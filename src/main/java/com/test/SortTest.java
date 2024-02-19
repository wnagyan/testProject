package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortTest {


    public static void main(String[] args) {
        //随机产生32个[0~3]的数字集合
//        Random random = new Random();
//        ArrayList<Integer> list = new ArrayList<>();
//        //这里为什么是32？
//        for (int i = 0; i < 32; i++) {
//            list.add(random.nextInt(4));
//        }
//        System.out.println(list);
//        list.sort((o1, o2) -> {
//            //定义一个不具备自反性的Comparator
//            if (o1 > o2) {
//                return 1;
//            }else {
//                return -1;
//            }
//        });
//
//        System.out.println(list);
//        int arr[] = {9,6,2,1,4,8,7,3,5};
//        mergeSort(arr, 0, arr.length - 1);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }



    }


    private static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void selectSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex!= i) {
                int temp = arr[i];
            }
        }
    }

    private static void insertSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 使用归并排序算法对给定数组进行排序
     * @param arr 待排序的数组
     * @param left 数组左边界的索引
     * @param right 数组右边界的索引
     */
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        // 创建一个临时数组，长度为right - left + 1
        int[] temp = new int[right - left + 1];
        // 定义三个指针i、j、k，分别表示在临时数组、arr的左半部分、arr的右半部分的位置
        int i = left;
        int j = mid + 1;
        int k = 0;
        // 判断哪个指针指向的元素较小，将较小的元素复制到临时数组，同时将相应的指针向后移动
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // 将剩余的元素复制到临时数组
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        // 将临时数组中的元素复制回原数组
        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
        }
    }


}
