package com.mine;

/**
 * Created by fatchao
 * 日期  2018-02-08.
 * 邮箱  fat_chao@163.com
 */

public class FindTarget {

    public static int[] find(int[] nums, int target) {

        int[] find = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (another == nums[j] && j != i) {
                    if (i < j) {
                        find[0] = i;
                        find[1] = j;
                    } else {
                        find[0] = j;
                        find[1] = i;
                    }
                    break;
                }
            }


        }

        return find;

    }

    public static void main(String[] args) {

        int[] temp = new int[]{0, 4, 3, 0};
        int[] ints = find(temp, 0);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
