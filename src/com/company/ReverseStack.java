package com.company;

/**
 * author chmyy
 * created on 2018/1/4
 * email fat_chao@163.com.
 */

import java.util.Stack;

/**
 * 1.获取并移除栈的最后一个元素
 * 2.递归调用1中的方法，然后借助递归的特性实现栈的逆序
 */

public class ReverseStack {


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        reverseStack(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


    }

    //获取并移除栈的最后一个元素
    public static int getStackBottom(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int stackBottom = getStackBottom(stack);
            stack.push(result);
            return stackBottom;
        }

    }


    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        } else {
            int stackBottom = getStackBottom(stack);
            reverseStack(stack);
            stack.push(stackBottom);
        }

    }


}
