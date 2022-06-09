package com.maycur.leetcode.offerI;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * @topic 统计一个数字在排序数组中出现的次数。
 *
 * 链接：https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof
 *
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * @topic 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
 */
public class Offer53 {

    public static void main(String[] args) {
        System.out.println(search(new int[]{5,7,7,8,8,10}, 8));
    }

    public static int search(int[] nums, int target) {
        int count = 0;
        int left = 0;
        int right = nums.length;
        int mid = (left + right) / 2;
        if(nums.length == 0){
            return count;
        }
        while (left < right){
            mid = (left + right) / 2;
            if(nums[mid] == target || left >= right){
                break;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid;
            }
        }
        int x = mid;
        int y = mid + 1;
        for (int i = x; i >= 0; i--){
            if(nums[i] == target){
                count++;
            }else {
                break;
            }
        }
        for (int i = y; i < nums.length; i++){
            if(nums[i] == target){
                count++;
            }else {
                break;
            }
        }
        return count;
    }

    public int missingNumber(int[] nums) {
//        int num = nums[0];
//        boolean flag = true;
//        for (int i = 1; i < nums.length; i++){
//            if(nums[i] - nums[i-1] != 1){
//                num = nums[i]-1;
//                flag = false;
//            }
//        }
//        if(flag){
//            if(nums[0] == 0){
//                return nums[nums.length - 1] + 1;
//            }else {
//                return nums[0] - 1;
//            }
//        }else {
//            return num;
//        }
        int i = 0, j = nums.length;
        int mid = 0;
        while (i <= j){
            mid = (i + j) / 2;
            if(nums[mid] == mid){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return i;
    }


}
