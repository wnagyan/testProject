package com.maycur.leetcode.easy.algorithm.common;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 2418. 按身高排序
 *
 * @topic 给你一个字符串数组 names ，和一个由 互不相同 的正整数组成的数组 heights 。两个数组的长度均为 n 。
 * 对于每个下标 i，names[i] 和 heights[i] 表示第 i 个人的名字和身高。
 * 请按身高 降序 顺序返回对应的名字数组 names 。
 *
 * 链接：https://leetcode.cn/problems/sort-the-people
 */
public class Q2418 {

    public String[] sortPeople(String[] names, int[] heights) {
        List<People> peopleList = new ArrayList<>();
        for (int i = 0; i < names.length; i++){
            People people = new People(names[i], heights[i]);
            peopleList.add(people);
        }
        Collections.sort(peopleList, Comparator.comparing(People::getHeight).reversed());
        String[] name = new String[names.length];
        int i = 0;
        for (People people : peopleList){
            name[i++] = people.getName();
        }
        return name;
    }

    class People{
        String name;
        int height;

        public People(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public int getHeight() {
            return height;
        }
    }
}
