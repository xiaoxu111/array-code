package com.aliwo.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * package_name:com.aliwo.array
 *
 * @author:徐亚远 Date:2020/12/23 22:21
 * 项目名:array-code-git
 * Description:TODO
 * Version: 1.0
 **/

public class ArrayTest {
    @Test
    public void test01() {
        // 数组声明
        int[] ids;
        // 数组静态初始化，数组的初始化和数组的赋值同时进行
        ids = new int[]{1, 2, 3, 4, 5};
        // 数组的动态初始化，数组的初始化和数组的赋值不是同时进行的
        String[] names = new String[4];
        // 总结数组一旦初始化，其长度就确定了
    }

    @Test
    public void test02() {
        // 如何调用数组中指定位置的元素:通过角标的方式
        String[] names = new String[4];
        names[0] = "s";
        names[1] = "a";
        names[2] = "e";
        names[3] = "r";
        System.out.println(Arrays.toString(names));
        System.out.println("names.length:" + names.length);
        System.out.println(names[0].toString());
        // 遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    @Test
    public void test03() {
        // 数组元素的默认初始化值
        // 数组元素是整型(byte,short,int long) 默认值是 0
        byte[] arr1 = new byte[3];
        System.out.println("byte[]默认值:" + arr1[2]);
        short[] arr2 = new short[3];
        System.out.println("short[]默认值:" + arr2[2]);
        int[] arr3 = new int[3];
        System.out.println("int[]默认值:" + arr3[2]);
        long[] arr4 = new long[3];
        System.out.println("long[]默认值:" + arr4[2]);
        System.out.println("*************************");
        // 数组元素是浮点型(float,double) 默认值是0.0
        float[] frr1 = new float[3];
        System.out.println("float[]默认值:" + frr1[2]);
        double[] drr1 = new double[3];
        System.out.println("double[]默认值:" + drr1[2]);
        // 数组元素是boolean型  默认值是  false
        boolean[] brr1 = new boolean[3];
        System.out.println("boolean[]默认值；" + brr1[2]);
        // 数组元素是char型  默认值是 0或'\u0000' 而非 '0'
        char[] crr1 = new char[3];
        System.out.println("char[]默认值:" + crr1[2]);
        // 引用数据类型默认值 null
        String[] strr = new String[4];
        System.out.println("引用数据类型默认值 String[] :" + strr[2]);
        if (strr[2] == null) {
            System.out.println("你好啊");
        }
        if (strr[1] == "null") {
            System.out.println("你不好啊!");
        }
    }
    // 数组的内存解析

}
