package com.mine;

import java.util.Objects;

/**
 * author chmyy
 * created on 2018/1/11
 * email fat_chao@163.com.
 */

public class SymmetryLinkedList {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(2);
        node.next.next.next.next = new Node(1);
        NodeUtils.printNode(node);
        System.out.println();
        Node node1 = ReverseLinkList.reverseNode(node);
        NodeUtils.printNode(node1);
        System.out.println();
        boolean b = testSymmetry(node,node1);
        System.out.println(b);


    }

    private static boolean testSymmetry(Node node, Node node1) {
        while (node.value.equals(node1.value) && node.next != null && node1.next != null) {
            node = node.next;
            node1 = node1.next;
        }
        return Objects.equals(node.value, node1.value);
    }

}
