package com.amos.util;

/**
 * @Title: LinkedNode
 * @Description: 链表节点类
 */
public class LinkedNode {

    public int data;
    public LinkedNode next;

    //实例化
    public LinkedNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LinkedNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
