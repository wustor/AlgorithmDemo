package com.mine;

/**
 * author chmyy
 * created on 2018/1/8
 * email fat_chao@163.com.
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 * <p>
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 */

//单链表

/**
 * 1.遍历Node，记录链表的Node节点N
 * 2.将倒数第K个节点转化为正数的N-1-K
 * 3.遍历Node，到N-1-K处停止，删除当前节点
 */
//双链表

/**
 * 1.将节点移动到链表的尾部
 * 2.然后定义一个标记位
 * 3.然后从尾部开始遍历，到K位置的时候
 */

public class DeleteKNode {


    public void deleteSingleLink(Node node, int number) {

        if (node == null)
            throw new RuntimeException("Node不能为空");
        Node first = node;
        int nodeCount = 0;
        while (node != null) {
            nodeCount++;
            node = node.next;
        }

        if (number > nodeCount - 1)
            throw new RuntimeException("删除节点数大于Node节点数");

        int deleteCount = nodeCount - number;
        nodeCount = 0;
        while (first != null) {
            if (++nodeCount == deleteCount) {
                System.out.println(first.value);
                Node delete = first.next;
                first.next = delete.next;
                delete.next = null;
                break;
            }
            first = first.next;

        }


    }

    public void deleteDoubleLink(Node node, int number) {
        if (node == null)
            throw new RuntimeException("Node不能为空");
        int nodeCount = 0;
        while (node != null) {
            nodeCount++;
            node = node.next;
        }

        if (number > nodeCount)
            throw new RuntimeException("删除节点数大于Node节点数");
        int count = 0;
        while (node != null) {
            if (++count == number) {
                //删除第K个节点
                Node pre = node.pre;
                node.pre = pre.pre;
                pre.pre.next = node;
                pre.pre = null;
                pre.next = null;
                break;

            }
            node = node.pre;

        }


    }


    public static void main(String[] args) {
        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(8);
        node.next.next.next = new Node(10);
        DeleteKNode deleteKNode = new DeleteKNode();
        deleteKNode.deleteSingleLink(node, 2);


    }

}
