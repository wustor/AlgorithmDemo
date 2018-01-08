package com.company;

/**
 * author chmyy
 * created on 2018/1/8
 * email fat_chao@163.com.
 */

public  class NodeUtils {


    public static void printNode(Node node){
        while (node!=null){
            System.out.println(node.next);
            node=node.next;
        }

    }
}
