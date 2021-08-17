package com.amos.util;


import java.util.ArrayList;

/**
 * @Title: SingleLinkedList
 * @Description: 实例化链表
 */
public class SingleLinkedList {

    private LinkedNode head = new LinkedNode(0);

    //头节点
    public LinkedNode getHead() {
        return head;
    }

    //添加节点
    public void addLinkedNode(LinkedNode node) {
        //因为head节点是不能动得，因此我们需要一个辅助节点 temp来遍历
        LinkedNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    //显示列表
    public void showLinkedList(LinkedNode head) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //因为头节点不能动，所以需要辅助变量来遍历
        LinkedNode temp = head.next;
        if (temp == null) {
            System.out.println("空链表");
            return;
        }
        ArrayList<Integer> integers = new ArrayList<>();
        while (temp != null) {
            integers.add(temp.data);
            temp = temp.next;
        }
        //逆序输出
        for (int i = integers.size() - 1; i >= 0; i--) {
            System.out.print(integers.get(i));
        }


    }

    //修改链表节点数据
    public void updateLinkedList(LinkedNode node) {
        if (head.next == null) {
            System.out.println("空链表");
            return;
        }

        LinkedNode temp = head.next;
        boolean flag = false;

        while (true) {
            if (temp.next == null) break;
            if (temp.data == node.data) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.data = node.data;
        } else {
            System.out.println("没有找到该" + node.data);
        }
    }



}
