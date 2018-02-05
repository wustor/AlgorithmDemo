package com.mine;

/**
 * author chmyy
 * created on 2018/1/18
 * email fat_chao@163.com.
 */

import com.utils.Node;
import com.utils.NodeUtils;

/**
 * 1.逆序两个链表
 * 2.然后相加，判断是否需要进位
 */


class NodeAdd {

    public static Node add(Node first, Node second) {

        Node firstNode = ReverseLinkList.reverseNode(first);
        NodeUtils.printNode(firstNode);
        System.out.println();
        Node secondNode = ReverseLinkList.reverseNode(second);
        NodeUtils.printNode(secondNode);
        Node node = new Node(null);
        Integer left = 0;
        while (firstNode != null && secondNode != null) {
            Integer result = firstNode.value + secondNode.value;
            result += left;
            if (result >= 10) {
                left = result - 10;
                result -= 10;
            } else {
                left = 0;

            }

            if (node.value == null) {
                node.value = result;
            } else
                insertNode(node, new Node(result));

            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }

        if (firstNode == null) {
            insertNode(node, secondNode);
        } else {
            insertNode(node, firstNode);
        }

        return node;

    }

    public static void insertNode(Node head, Node insert) {

        if (head == null)
            throw new RuntimeException("链表头部不能为空");
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = insert;

    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(3);
        node.next.next = new Node(7);
        Node node1 = new Node(3);
        node1.next = new Node(2);
        Node add = add(node, node1);

        Node node2 = ReverseLinkList.reverseNode(add);
        System.out.println();
        NodeUtils.printNode(node2);
    }

}
