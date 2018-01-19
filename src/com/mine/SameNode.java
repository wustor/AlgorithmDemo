package com.mine;

/**
 * Created by fatchao
 * 日期  2018-01-07.
 * 邮箱  fat_chao@163.com
 */

import com.utils.Node;

/**
 * 1.比较两个Node的头结点
 * 2.然后遍历头结点小的那个，找到他们相等
 */


public class SameNode {


    public void findSame(Node first, Node second) {
        if (first == null || second == null)
            throw new IllegalArgumentException("链表为空");

        while (first != null && second != null) {
            int result = first.value.compareTo(second.value);
            switch (result) {
                case -1:
                    first = first.next;
                    break;
                case 0:
                    System.out.println(first.value);
                    first = first.next;
                    second = second.next;
                    break;
                case 1:
                    second = second.next;
                    break;
            }

        }


    }

    public void printNode(Node node) {
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }

    }

    public static void main(String[] args) {

        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(8);
        node.next.next.next = new Node(10);
        SameNode sameNode = new SameNode();
        //sameNode.printNode(node);
        Node node1 = new Node(2);
        node1.next = new Node(3);
        //sameNode.printNode(node1);
        sameNode.findSame(node, node1);


    }

}
