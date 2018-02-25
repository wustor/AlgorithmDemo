package com.mine;

/**
 * Created by fatchao
 * 日期  2018-02-23.
 * 邮箱  fat_chao@163.com
 */

public class BinarySearch {
    public static int bsearch(int array[], int low, int high, int target) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (array[mid] > target)
            return bsearch(array, low, mid - 1, target);
        if (array[mid] < target)
            return bsearch(array, mid + 1, high, target);

        return mid;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7, 11, 13, 17};
        int target = 7;
        int bsearch = bsearch(array, 0, array.length - 1, target);
        System.out.println(bsearch);
    }
}
