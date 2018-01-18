package com.mine;

/**
 * Created by fatchao
 * 日期  2018-01-15.
 * 邮箱  fat_chao@163.com
 */

/**
 * 查找数组中出现频率最高的元素
 * 1.定义一个数组，数组长度是已知数组元素的的最大值
 * 2.然后遍历原始数组，如果下标相同，那么该元素就自增
 * 3.定义一个int变量max记录最大数，每次遍历的时候就跟当前的数组中的元素比对
 * 4.输出max
 */
class MostAppeared {

    public static int findMostAppeared(int[] arr) {

        int[] temp = new int[10];
        int max = 0;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
            if (index == -1) {
                max = temp[arr[i]];
                index = i;
            } else {
                if (max < temp[arr[i]]) {
                    max = temp[arr[i]];
                    index = i;
                }

            }
        }

        return index;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 8, 7, 4, 3, 2, 5, 4, 5};
        int mostAppeared = findMostAppeared(arr);
        System.out.println(arr[mostAppeared]);

    }

}
