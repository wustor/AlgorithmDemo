package com.mine;

import com.utils.Node;
import com.utils.NodeUtils;

import java.util.LinkedHashMap;

/**
 * author chmyy
 * created on 2018/1/19
 * email fat_chao@163.com.
 */

public class DeleteDuplicateNode {


    public static Node deleteRepeat(Node node) {
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();

        while (node != null) {
            Integer value = node.value;
            hashMap.putIfAbsent(value, value);
            node = node.next;
        }

        Node newNode = null;
        Node temp = null;
        for (Integer value : hashMap.values()) {
            if (newNode == null) {
                newNode = new Node(value);
                temp = newNode;
            } else {
                temp.next = new Node(value);
                temp = temp.next;

            }
        }

        return newNode;

    }

    public static Node deleteDuplicate(Node node) {
        Node firstNode = node;

        while (firstNode != null) {
            //删除链表中的重复的单个元素
            Integer value = firstNode.value;
            Node temp = firstNode;
            while (temp != null) {
                if (temp.next != null && temp.next.value.equals(value)) {
                    Node next = temp.next;
                    temp.next = next.next;
                }
                temp = temp.next;

            }

            firstNode = firstNode.next;

        }

        return node;
    }


    public static void main(String[] args) {
        Node node = NodeUtils.getRepeatNode();
        NodeUtils.printNode(node);
        System.out.println();
        Node result = deleteRepeat(node);
        NodeUtils.printNode(result);
    }

}
