package com.company;

import java.util.Arrays;

/**
 * author chmyy
 * created on 2018/1/6
 * email fat_chao@163.com.
 */

public class VisibleMaxArray {

    private Integer[] orderArray;
    private Integer[] max;
    private Integer winLen;

    public VisibleMaxArray(Integer[] orderArray, Integer winLen) {
        this.orderArray = orderArray;
        this.winLen = winLen;
        max = new Integer[orderArray.length-winLen+1];
    }


    public void getVisibleMax() {
        int len = orderArray.length - winLen + 1;
        for (int i = 0; i < len; i++) {

            int maxNumber = orderArray[i];
            for (int j = i + 1; j < winLen + i; j++) {
                if (maxNumber < orderArray[j])
                    maxNumber = orderArray[j];
            }
            max[i] = maxNumber;

        }

        System.out.println(Arrays.toString(max));
    }

    public static void main(String[] args) {
        Integer[] test = new Integer[]{4, 3, 5, 4, 3, 3, 6, 7};
        VisibleMaxArray visibleMaxArray=new VisibleMaxArray(test,3);
        visibleMaxArray.getVisibleMax();

    }


}
