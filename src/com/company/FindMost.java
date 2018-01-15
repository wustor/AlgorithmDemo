package com.company;

/**
 * Created by fatchao
 * 日期  2018-01-15.
 * 邮箱  fat_chao@163.com
 */

class FindMost {

    // 递归使用快速排序,对arr[l...r]的范围进行排序
    private static void sort(Comparable[] arr, int l, int r) {
        if (l >= r)
            return;
        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);
    }

    // 对arr[l...r]部分进行partition操作
// 返回p, 使得arr[l...p-1] < arr[p] ; arr[p+1...r] > arr[p]
    private static int partition(Comparable[] arr, int l, int r) {
        Comparable v = arr[l];
        int j = l; // arr[l+1...j] < v ; arr[j+1...i) > v
        for (int i = l + 1; i <= r; i++)
            if (arr[i].compareTo(v) < 0) {
                j++;
                swap(arr, j, i);
            }
        swap(arr, l, j);
        return j;
    }

    private static void swap(Comparable[] arr, int a, int b) {
        Comparable tem = arr[a];
        arr[a] = arr[b];
        arr[b] = tem;
    }


    public static void main(String[] args) {
        Comparable[] comparables = new Comparable[]{1, 2, 3, 4, 8, 7, 4, 3, 2, 5, 4, 5};
        //快排进行排序
        sort(comparables, 0, comparables.length - 1);
        Comparable first = null;
        int firstCount = 0;
        Comparable second = null;
        int secondCount = 0;
        Comparable max = null;
        int maxCount = 0;
        for (Comparable comparable : comparables) {
            if (first == null) {
                first = comparable;
                firstCount++;
                continue;
            }
            if (second == null) {
                second = comparable;
                secondCount++;
                continue;
            }
            if (first.compareTo(comparable) == 0) {
                firstCount++;
                secondCount = 0;
                continue;
            }
            if (second.compareTo(comparable) == 0) {
                secondCount++;
                firstCount = 0;
            } else {
                if (firstCount < secondCount && maxCount < secondCount) {
                    maxCount = secondCount;
                    max = second;

                } else if (firstCount > secondCount && maxCount < firstCount) {
                    maxCount = firstCount;
                    max = first;
                }
                first = null;
                second = null;
                secondCount = 0;
                firstCount = 0;
            }

        }
        System.out.println(max);
    }

}
