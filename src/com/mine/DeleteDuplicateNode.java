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
        Node cur = null;
        for (Integer value : hashMap.values()) {
            if (newNode == null) {
                newNode = new Node(value);
                cur = newNode;
            } else {
                cur.next = new Node(value);
                cur = cur.next;

            }
        }

        return newNode;

    }

    public static Node deleteDuplicate(Node node) {
        Node firstNode = node;

        while (firstNode != null) {
            //删除链表中的重复的单个元素
            Integer value = firstNode.value;
            Node cur = firstNode.next;
            Node pre = firstNode;
            while (cur != null) {
                if (cur.value.equals(value)) {
                    pre.next = cur.next;
                }
                pre = cur;
                cur = cur.next;

            }
            firstNode = firstNode.next;

        }

        return node;
    }


    public static void main(String[] args) {
        Node node = NodeUtils.getRepeatNode();
        NodeUtils.printNode(node);
        System.out.println();
        Node result = deleteDuplicate(node);
        NodeUtils.printNode(result);
    }

}
