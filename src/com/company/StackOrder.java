package com.company;

import java.util.Stack;

/**
 * author chmyy
 * created on 2018/1/5
 * email fat_chao@163.com.
 */

/**
 * 1.定义一个变量，用来标记normalStack中的最大指
 * 2.遍历normalStack，找到最大值
 * 3.将遍历到的最大值依次放进orderStack中
 * 4.依次弹栈
 */

public class StackOrder {

    private Integer max = -1;
    private Stack<Integer> normalStack;
    private Stack<Integer> orderStack;

    public StackOrder(Stack<Integer> stack) {
        this.normalStack = stack;
        orderStack = new Stack<>();

    }


    public void order() {
        Integer pop = normalStack.pop();
        if (normalStack.isEmpty()) {
            normalStack.push(pop);
            orderStack.push(max);
        } else {
            if (max.compareTo(pop) < 0)
                max = pop;
            order();
            if (!(pop.compareTo(max) == 0))
                normalStack.push(pop);
        }

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(9);
        stack.push(10);
        stack.push(7);
        StackOrder stackOrder = new StackOrder(stack);
        stackOrder.test();

    }

    public void test() {
        long count = normalStack.size();
        while (orderStack.size() < count) {
            max = normalStack.peek();
            order();
            System.out.println(max);

        }
       while (orderStack.isEmpty())
           System.out.println(orderStack.pop());
    }
}
