package com.company;

/**
 * Created by fatchao
 * 日期  2018-01-10.
 * 邮箱  fat_chao@163.com
 */

/**
 * 1.递归遍历链表
 * 2.归的过程解决问题
 */

public class ReverseLinkList {

    public static Node reverseNode(Node node) {

        Node current = node;

        if (node.next == null) {
            return node;

        } else {
            node = node.next;
            Node node1 = reverseNode(node);
            node.next = current;
            current.next = null;
            return node1;

        }

    }


    public static void main(String[] args) {

        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(8);
        node.next.next.next = new Node(6);
        node.next.next.next.next = new Node(7);
        Node node1 = reverseNode(node);
        NodeUtils.printNode(node1);

    }
}
