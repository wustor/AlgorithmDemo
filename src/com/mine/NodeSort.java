package com.mine;

import com.utils.Node;
import com.utils.NodeUtils;

import java.util.Objects;

/**
 * author chmyy
 * created on 2018/1/25
 * email fat_chao@163.com.
 */

public class NodeSort {

    public static void main(String[] args) {
        Integer[] node = new Integer[]{7, 3, 2, 4, 12, 10};
        Node sortNode = NodeUtils.getNode(node);
        //NodeUtils.printNode(sortNode);
        System.out.println();
        Node sort = sort(sortNode);
        NodeUtils.printNode(sort);
    }

    public static Node sort(Node node) {
        if (node == null || node.next == null)
            throw new RuntimeException("Node不合理");
        Node sortNode = null;
        Node temp = null;
        while (node != null) {
            Integer value = null;
            if (node.next != null) {
                value = getMinNode(node);
                changeWithHead(node, value);
            } else
                value = node.value;
            if (sortNode == null) {
                sortNode = new Node(value);
            } else {
                temp = sortNode;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(value);

            }
            node = node.next;

        }


        return sortNode;
    }


    public static void changeWithHead(Node node, Integer value) {

        if (Objects.equals(node.value, value)) {
            node.value = value;

        } else {
            Integer headValue = node.value;
            Node temp = node;
            while (temp != null) {
                if (Objects.equals(temp.value, value)) {
                    node.value = value;
                    temp.value = headValue;
                    break;
                }

                temp = temp.next;

            }

        }


    }

    //获取链表中的最小元素
    public static Integer getMinNode(Node node) {
        Integer min = node.value;
        while (node != null) {
            min = min.compareTo(node.value) > 0 ? node.value : min;
            node = node.next;
        }
        return min;

    }


}
