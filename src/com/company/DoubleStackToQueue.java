package com.company;

/**
 * Created by fatchao
 * 日期  2018-01-03.
 * 邮箱  fat_chao@163.com
 */

import java.util.Stack;

/**
 * 1.创建两个栈orderStack，invertedStack
 * 2.入队：若invertedStack为空，则将元素加入到orderStack中
 * 否则将invertedStack依次出栈，加入到orderStack中，然后再此元素入栈
 * 3.出队：将orderStack依次弹栈然后invertedStack依次入栈
 */


public class DoubleStackToQueue {

    public static void main(String[] args) {
        DoubleStackToQueue doubleStackToQueue = new DoubleStackToQueue();
        doubleStackToQueue.add(2);
        doubleStackToQueue.add(3);
        doubleStackToQueue.add(4);
        doubleStackToQueue.add(5);
        doubleStackToQueue.add(6);
        while (!doubleStackToQueue.isEmpty()) {
            System.out.println(doubleStackToQueue.poll());
        }


    }

    private boolean isEmpty() {
        return invertedStack.isEmpty();
    }

    private Stack<Comparable> orderStack;
    private Stack<Comparable> invertedStack;
    private boolean isFirst = true;//首次进入的标志

    public DoubleStackToQueue() {
        orderStack = new Stack<>();
        invertedStack = new Stack<>();
    }

    public void add(Comparable comparable) {
        if (!isFirst) {
            invertedToOrder();
        }
        isFirst = false;
        orderStack.push(comparable);
        orderToInverted();
    }

    public Comparable poll() {
        orderToInverted();
        if (invertedStack.isEmpty())
            throw new RuntimeException("poll时栈为空");
        return invertedStack.pop();

    }


    public Comparable peek() {
        orderToInverted();
        if (invertedStack.isEmpty())
            throw new RuntimeException("peek时栈为空");
        return invertedStack.peek();
    }

    private void orderToInverted() {
        while (!orderStack.isEmpty()) {
            invertedStack.push(orderStack.pop());
        }

    }

    private void invertedToOrder() {
        if (invertedStack.isEmpty())
            orderStack.clear();
        else {
            while (!invertedStack.isEmpty()) {
                orderStack.push(invertedStack.pop());
            }
        }


    }


}
