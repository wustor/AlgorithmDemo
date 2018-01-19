package com.mine;

/**
 * author chmyy
 * created on 2018/1/9
 * email fat_chao@163.com.
 */

import com.utils.Node;
import com.utils.NodeUtils;

/**
 * 采用递归进行实现，在归的过程中解决问题
 * 1.递归遍历链表的Node
 * 2.定义一个变量，在递的过程中记录Node的节点数量
 * 3.在归的过程中找到中间节点的前一个节点，然后进行删除
 */


public class DeleteMiddleNode {

    private int count = 0;
    private int preMiddle = 0;

    public void deleteMiddle(Node node) {

        if (node == null)
            throw new RuntimeException("链表为空");
        if (node.next == null) {
            node = null;
            return;
        }

        findMiddle(node);


    }


    public static void main(String[] args) {
        Node node = NodeUtils.getNode();
        DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode();
        deleteMiddleNode.deleteMiddle(node);
    }


    private void findMiddle(Node node) {
        Node current = node;
        if (node == null) {
            //找到中间节点的前一个节点
            if (count % 2 == 0) {
                //偶数
                preMiddle = count / 2 - 1;

            } else {
                //奇数
                preMiddle = (count + 1) / 2 - 1;
            }

        } else {
            int number = ++count;
            node = node.next;
            findMiddle(node);
            if (number == preMiddle) {
                //删除中间节点
                Node next = current.next;
                current.next = next.next;
                System.out.println(next.value);

                next = null;


            }


        }


    }
}
