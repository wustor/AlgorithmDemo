package com.mine;
/**
 * Created by fatchao
 * 日期  2018-01-02.
 * 邮箱  fat_chao@163.com
 */

import java.util.Stack;

/**
 * 1.创建两个栈mStackData跟mStackMin，一个用存放基本数据，一个用来存放当前最小的数据
 * 2.入栈操作：当栈为空的时候，分别入栈；当栈不为空的时候，
 * 比较入栈元素跟最小值进行比较，如果入栈元素小于等于栈中的最小值，则mStackMin入栈
 * 3.出栈操作：如果mStackData的出栈元素等于当前元素的最小值，mStackMin也出栈
 * 4.getMin只需要获取mStackMin中的最小元素即可
 */


public class GetMinStack {

    public static void main(String[] args) {

        GetMinStack getMinStack=new GetMinStack();
        getMinStack.push(8);
        getMinStack.push(8);
        getMinStack.push(23);
        getMinStack.push(3);
        getMinStack.push(10);
        getMinStack.push(7);
        getMinStack.push(1);

        System.out.println(getMinStack.getMin());
        getMinStack.pop();
        System.out.println(getMinStack.getMin());
    }

    private Stack<Comparable> mStackData;
    private Stack<Comparable> mStackMin;

    public GetMinStack() {
        mStackData = new Stack<>();
        mStackMin = new Stack<>();
    }

    //入栈操作
    public void push(Comparable comparable) {
        mStackData.push(comparable);
        if (mStackMin.isEmpty())
            mStackMin.push(comparable);
        else {
            if (comparable.compareTo(getMin()) <= 0)
                mStackMin.push(comparable);
        }

    }
    //出栈操作
    public Comparable pop() {
        Comparable pop = mStackData.pop();
        if (pop.compareTo(getMin()) == 0)
            mStackMin.pop();
        return pop;
    }

    public Comparable getMin() {
        return mStackMin.isEmpty() ? null : mStackMin.peek();
    }

    public Comparable peek() {
        return mStackData.peek();
    }

}
