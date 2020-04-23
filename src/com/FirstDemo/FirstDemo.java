package com.FirstDemo;

import java.util.Arrays;
import java.util.List;

/**
 * 数组
 *
 * @Author: cny
 * @Date: 2020/4/13 11:10
 */
public class FirstDemo {
    public static void main(String[] args) {
        //声明
        int[] arr;
        int[] arr1;
        //创建+赋值
        arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println("arr="+arr[0]+","+arr[1]);
        System.out.println("arr长度:"+arr.length);
        //创建+赋值
        arr1 = new int[]{1,2};
        System.out.println("arr1="+arr1[0]+","+arr1[1]);
        //声明+创建
        int[] arr2 = new int[2];
        //声明+创建+赋值
        int[] arr3 = {1,2,3};
        //循环打印出数组
        list(arr3);
        //复制一个指定长度的数组
        int[] arr4 = Arrays.copyOf(arr3, 2);
        //复制一个指定范围的数组，包头不包尾
        int[] arr5 = Arrays.copyOfRange(arr3, 0, 3);
        list(arr4);
        list(arr5);
        String s1 = Arrays.toString(arr3);
        System.out.println(s1);
    }

    private static void list(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
