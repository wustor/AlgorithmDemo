package com.mine;

/**
 * author chmyy
 * created on 2018/1/18
 * email fat_chao@163.com.
 */

/**
 * 1.遍历Node，然后拿到数值,最终转化成int
 * 2.然后相加，最后分解
 */


class NodeAdd {

    public static Node add(Node first, Node second) {

        int a = 0;
        int b = 0;
        int c = 0;
        Node head = null;
        StringBuilder sbFirst = null;
        StringBuilder sbSecond = null;
        while (first != null) {
            if (sbFirst == null) {
                sbFirst = new StringBuilder();
            }
            sbFirst.append(first.value.intValue());
            first = first.next;
        }

        while (second != null) {
            if (sbSecond == null) {
                sbSecond = new StringBuilder();
            }
            sbSecond.append(second.value.intValue());
            second = second.next;
        }

        if (sbFirst != null)
            a = Integer.valueOf(sbFirst.toString());
        if (sbSecond != null)
            b = Integer.valueOf(sbSecond.toString());

        c = a + b;
        String value = String.valueOf(c);
        for (int i = 0; i < value.length(); i++) {
            Integer integer = Integer.valueOf(String.valueOf(value.charAt(i)));
            if (head == null) {
                head = new Node(integer);
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(integer);
            }


        }

        return head;
    }

    public static void main(String[] args) {
        Node node = new Node(9);
        node.next = new Node(3);
        node.next.next = new Node(7);
        Node node1 = new Node(6);
        node1.next = new Node(3);
        Node add = add(node, node1);
        NodeUtils.printNode(add);
    }

}
