package com.mine;

import com.utils.Node;
import com.utils.NodeUtils;

/**
 * author chmyy
 * created on 2018/1/20
 * email fat_chao@163.com.
 */

public class DeleteParticularNode {


    public static Node deleteNode(Node node, Integer value) {

        if (node == null)
            throw new NullPointerException("Node不能为空");

        if (value.equals(node.value)) {
            node = node.next;
        }

        Node temp = node;
        Node pre = null;
        while (temp != null) {

            if (value.equals(temp.value)) {

                if (pre != null)
                    pre.next = temp.next;

            }
            pre = temp;
            temp = temp.next;

        }
        return node;

    }

    public static void main(String[] args) {
        Node node = NodeUtils.getNode();
        NodeUtils.printNode(node);
        System.out.println();
        Node node1 = deleteNode(node, 3);
        NodeUtils.printNode(node1);

    }
}
