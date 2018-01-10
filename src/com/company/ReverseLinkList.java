package com.company;

/**
 * Created by fatchao
 * 日期  2018-01-10.
 * 邮箱  fat_chao@163.com
 */

/**
 * 1.递归遍历链表
 * 2.
 */

public class ReverseLinkList {
    private static Node last;

    public static void reverseNode(Node node) {

        Node current = node;

        if (node == null) {

        } else {
            node = node.next;
            reverseNode(node);
            if (node != null) {
                node.next = current;
                current.next = null;
            } else {
                last = current;
            }


        }

    }


    public static void main(String[] args) {

        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(8);
        node.next.next.next = new Node(6);
        node.next.next.next.next = new Node(7);
        reverseNode(node);
        NodeUtils.printNode(last);

    }
}
