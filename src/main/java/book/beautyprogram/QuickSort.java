package book.beautyprogram;

import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

public class QuickSort {

    public static void quickSort(int left, int right, int[] x){
        int i, m;
        if (left >= right){
            return;
        }
        int index = RandomUtils.nextInt(left, right);
        m = index;
        for (i = left + 1; i <= right; i++){
            if (x[i] < x[left]){
                int temp = x[i];
                x[i] = x[left];
                x[left] = temp;
                m++;
            }
        }
        int temp = x[m];
        x[m] = x[left];
        x[left] = temp;
        quickSort(left, m-1, x);
        quickSort(m+1, right, x);
    }

    public static void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        int[] x = new int[]{4, 7, 2, 8, 3, 5, 6, 1, 2, 1};
        quickSort(0, x.length-1, x);
        for (int i : x) {
            System.out.print(i + " ");
        }
    }
}
