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
        Node node = null;
        Node temp = null;
        for (Integer integer : arr) {
            if (node == null) {
                node = new Node(integer);
                temp = node;

            } else {
                temp.next = new Node(integer);
                temp = temp.next;
            }

        }

        return node;
    }


}
