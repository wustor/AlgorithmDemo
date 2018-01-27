package com.mine;

import com.utils.Node;
import com.utils.NodeUtils;

/**
 * Created by fatchao
 * 日期  2018-01-26.
 * 邮箱  fat_chao@163.com
 */

public class MergeSortedNode {


    public static Node mergeSortedNode(Node first, Node second) {
        if (first == null || second == null)
            throw new RuntimeException("Node节点不能为空");
        Node node = null;
        while (first != null) {
            if (second == null)
                break;
            else {
                if (second.value.compareTo(first.value) > 0) {
                    if (node == null) {
                        node = new Node(first.value);
                    } else {
                        addNode(node, new Node(first.value));
                    }
                    first = first.next;
                } else {
                    if (node == null) {
                        node = new Node(second.value);
                    } else {
                        addNode(node, new Node(second.value));
                    }
                    second = second.next;

                }

            }

        }
        if (first == null) {
            addNode(node, second);
        } else {
            addNode(node, first);
        }


        return node;
    }

    private static void addNode(Node node, Node inserNode) {
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = inserNode;

    }

    public static void main(String[] args) {
        Integer[] first = new Integer[]{1, 2, 5, 9};
        Integer[] second = new Integer[]{2, 3};

        Node node = NodeUtils.getNode(first);
        Node node1 = NodeUtils.getNode(second);
        Node mergedNode = mergeSortedNode(node, node1);

        NodeUtils.printNode(mergedNode);


    }

}
