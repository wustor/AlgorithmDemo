package com.company;

/**
 * Created by fatchao
 * 日期  2018-01-07.
 * 邮箱  fat_chao@163.com
 */

/**
 * 1.比较两个Node的头结点
 * 2.然后遍历头结点小的那个，找到他们相等
 */


public class SameNode {

    public class Node {
        private Integer value;
        private Node next;

        public Node(Integer value) {
            this.value = value;
        }
    }

    public void findSame(Node first, Node second) {
        if (first == null || second == null)
            throw new IllegalArgumentException("链表为空");

        Integer firstValue = first.value;
        Integer secondValue = second.value;
        int result = firstValue.compareTo(secondValue);
        Integer same = null;
        Node current = null;
        switch (result) {
            case -1://first<second
                current = first;
                while (current.value.compareTo(secondValue) != 0) {
                    current = current.next;
                }
                same = current.value;
                System.out.println(same.intValue());
                while (current.next != null && second.next != null) {
                    System.out.println(current.value.intValue());
                    current = current.next;
                    second = second.next;
                }

                break;
            case 0://first=second
                same = firstValue;
                System.out.println(same.intValue());
                while (first.next != null && second.next != null) {
                    System.out.println(first.value.intValue());
                    first = first.next;
                    second = second.next;
                }
                break;
            case 1://first>second
                current = second;
                while (current.value.compareTo(firstValue) != 0) {
                    current = current.next;
                }
                same = current.value;
                System.out.println(same.intValue());
                while (current.next != null && first.next != null) {
                    System.out.println(current.value.intValue());
                    current = current.next;
                    second = second.next;
                }
                break;

        }


    }


}
