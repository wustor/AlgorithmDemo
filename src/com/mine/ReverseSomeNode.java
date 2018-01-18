package com.mine;

/**
 * Created by fatchao
 * 日期  2018-01-10.
 * 邮箱  fat_chao@163.com
 */

/**
 * 1.递归遍历链表
 * 2.归的过程解决问题
 */

public class ReverseSomeNode {
    private static int count;


    public static Node reverseNode(Node node, Integer from, Integer to) {
        Node current = node;

        if (node.next == null) {
            return node;

        } else {
            ++count;
            node = node.next;
            Node node1 = reverseNode(node, from, to);
            if (count >= from && count <= to) {
                node.next = current;
                current.next = null;
            }

            return node1;

        }

    }


    public static void main(String[] args) {

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        Node node1 = reverseNode(node, 1, 3);
        NodeUtils.printNode(node1);

    }
}
