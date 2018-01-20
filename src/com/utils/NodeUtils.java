package com.utils;

/**
 * author chmyy
 * created on 2018/1/8
 * email fat_chao@163.com.
 */

public class NodeUtils {


    public static void printNode(Node node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }

    }

    public static Node getNode(Integer[] arr) {
        for (Integer integer : arr) {

        }
        Node node = new Node(1);
        node.next = new Node(3);
        node.next.next = new Node(8);
        node.next.next.next = new Node(6);
        node.next.next.next.next = new Node(7);
        return node;
    }

    public static Node getRepeatNode() {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(4);
        node.next.next.next.next.next = new Node(4);
        node.next.next.next.next.next.next = new Node(2);
        node.next.next.next.next.next.next.next = new Node(1);
        node.next.next.next.next.next.next.next.next = new Node(1);
        return node;
    }


}
