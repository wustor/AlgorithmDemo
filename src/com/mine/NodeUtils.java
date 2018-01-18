package com.mine;

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
}
