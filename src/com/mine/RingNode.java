package com.mine;

import com.utils.Node;
import com.utils.NodeUtils;

/**
 * Created by fatchao
 * 日期  2018-02-06.
 * 邮箱  fat_chao@163.com
 */

public class RingNode {

    public static boolean isRing(Node head) {

        if (head == null || head.next == null)
            throw new RuntimeException("Node不合理");

        Node first = head;
        Node second = head;
        while (first != null && second.next != null) {
            first = first.next;
            second = second.next.next;
            if (first == second)
                return true;
        }
        return false;

    }

    public static void main(String[] args) {

        Integer[] intNode = new Integer[]{1, 3, 2, 5, 4};
        Node node = NodeUtils.getNode(intNode);
        System.out.println(isRing(node));
        System.out.println();
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node.next;

        System.out.println(isRing(node));


    }

}
