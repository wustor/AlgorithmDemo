package com.company;

import java.util.ArrayList;

/**
 * 获取最小的栈
 * 1.默认第一个元素为最小元素
 * 2.依次弹栈
 */


public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static class MinStack {
        public MinStack() {
        }

        static ArrayList<Integer> mStack = new ArrayList<Integer>();

        public static void push(Integer integer) {
            mStack.add(integer);
        }

        public static Integer pop() {
            Integer peek = peek();
            mStack.remove(peek);
            return peek;

        }

        public static Integer peek() {
            if (mStack.isEmpty())
                return null;
            else
                return mStack.get(0);
        }

        public static Integer getMin() {
            if (mStack.isEmpty())
                return null;
            else {
                Integer min = mStack.get(0);
                for (Integer integer : mStack) {
                    if (min.compareTo(integer) > 0)
                        min = integer;
                }
                return min;
            }

        }

    }
}
