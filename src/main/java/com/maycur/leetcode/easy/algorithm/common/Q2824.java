package com.maycur.leetcode.easy.algorithm.common;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 2824. 统计和小于目标的下标对数目
 *
 * @topic 给你一个下标从 0 开始长度为 n 的整数数组 nums 和一个整数 target ，请你返回满足 0 <= i < j < n 且 nums[i] + nums[j] < target 的下标对 (i, j) 的数目。
 *
 * 链接：https://leetcode.cn/problems/count-pairs-whose-sum-is-less-than-target/description/
 */
public class Q2824 {

    /**
     * 1. 先排序
     * 2. 从后往前遍历，用二分查找
     * 3. 二分查找的边界是 nums[i] + nums[j] < target
     */
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int res = 0;
        for (int i = 1; i < nums.size(); i++) {
            int k = binarySearch(nums, 0, i - 1, target - nums.get(i));
            res += k;
        }
        return res;
    }

    public int binarySearch(List<Integer> nums, int lo, int hi, int target) {
        int res = hi + 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums.get(mid) >= target) {
                res = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return res;
    }


    public static void main(String[] args) {
//        Tinme t1 = new Tinme(1, new Date(1709626406000L));//3.5
//        Tinme t2 = new Tinme(1, new Date(1709712806000L));//3.6
//        Tinme t3 = new Tinme(1, new Date(1709540006000L));//3.4
//        List<Tinme> list = new ArrayList<>();
//        list.add(t1);
//        list.add(t2);
//        list.stream().sorted(Comparator.comparing(Tinme::getId).reversed()).sorted((o1, o2) -> {
//            if (Objects.equals(o1.getReqStatus(), o2.getReqStatus()) && o1.getCreateDateTime().isAfter(o2.getCreateDateTime())) {
//                return -1;
//            }else if (Objects.equals(o1.getReqStatus(), o2.getReqStatus()) && o1.getCreateDateTime().isBefore(o2.getCreateDateTime())) {
//                return 1;
//            }else if (Objects.equals(o1.getReqStatus(), o2.getReqStatus()) && o1.getCreateDateTime().equals(o2.getCreateDateTime())) {
//                return 0;
//            }
//            return 1;
//        }).collect(Collectors.toList());
    }

    static class Tinme{
        int id;
        Date date;

        public Tinme(int id, Date date) {
            this.id = id;
            this.date = date;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

}
