package book.beautyprogram;

import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

public class QuickSort {

    /**
     * 使用快速排序算法对数组进行排序，每一次排序都是让基准数归位
     *
     * @param left  左边界
     * @param right 右边界
     * @param arr   待排序的数组
     */
    public static void quickSort(int left, int right, int[] arr) {
        if (left >= right) {
            return;
        }
        // 进行划分
        int i = left;
        for (int j = left + 1; j <= right; j++) {
            if (arr[j] > arr[left]) {
                i++;
                swap(arr, j, i);
            }
        }
        // 将基准元素移动到它应该在的位置
        swap(arr, i, left);
        // 递归地对两部分进行排序
        quickSort(left, i - 1, arr);
        quickSort(i + 1, right, arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int k = 1;
        int[] x = new int[]{4, 7, 20, 8, 3, 5, 11, 1, 2, 1, 13, 43, 23, 12, 10, 14};
        int[] x1 = new int[]{4, 7, 20, 8, 3, 5, 11, 1, 2, 1, 13, 43, 23, 12, 10, 14};
        findKthLargest(0, x.length - 1, k, x);
        System.out.println(x[k-1]);
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
        quickSort(0, x1.length - 1, x1);
        for (int i : x1) {
            System.out.print(i + " ");
        }
    }

    /**
     * 第k大的数
     * @param left
     * @param right
     * @param k
     * @param arr
     */
    public static void findKthLargest(int left, int right, int k, int[] arr) {
        if (left >= right) {
            return;
        }

        //这部分代码将数组分为两个部分，左侧的所有元素都小于等于arr[left]，右侧的所有元素都大于arr[left]。
        //使用变量i记录目前需要交换的位置，遍历数组找到需要交换的位置j，如果arr[j]大于arr[left]。
        int i = left;
        for (int j = left + 1; j <= right; j++) {
            if (arr[j] > arr[left]) {
                i++;
                swap(arr, j, i);
            }
        }
        //这里是为了找到基准数对应的正确位置，此时所有小的在基准数的右边（取决于上面for循环里的大于还是小于号）
        swap(arr, i, left);


        if (k > i){
            //此时基准数已归位，所以不用把基准数下标算入（从而导致多一次循环操作）
            findKthLargest(i + 1, right, k, arr);
        }else {
            findKthLargest(left, i - 1, k, arr);
        }
    }
}
