package com.mine;

/**
 * author chmyy
 * created on 2018/1/5
 * email fat_chao@163.com.
 */

import java.util.Stack;

/**
 * 1.申请一个栈，命名为orderStack
 * 2.将normalStack弹出，如果大于orderStack的栈顶元素，压栈
 * 3.如果小于orderStack的栈顶元素，则orderStack弹栈至normalStack
 * 直到orderStack的栈顶元素小于normalStack
 */

public class StackOrder {

    private Stack<Integer> normalStack;
    private Stack<Integer> orderStack;

    public StackOrder(Stack<Integer> normalStack) {
        this.normalStack = normalStack;
        orderStack = new Stack<>();
    }

    public void startOrder() {

        while (!normalStack.isEmpty()) {

            Integer pop = normalStack.pop();
            if (orderStack.isEmpty()) {
                orderStack.push(pop);

            } else {
                while (pop.compareTo(orderStack.peek()) < 0) {
                    normalStack.push(orderStack.pop());
                }
                orderStack.push(pop);

            }

        }

        while (!orderStack.isEmpty())
            System.out.println(orderStack.pop());

    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        stack.push(23);
        stack.push(3);
        stack.push(10);
        stack.push(7);
        stack.push(1);
        StackOrder stackOrder = new StackOrder(stack);
        stackOrder.startOrder();
    }

}
