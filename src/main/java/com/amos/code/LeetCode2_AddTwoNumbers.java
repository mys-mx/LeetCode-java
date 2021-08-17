package com.amos.code;


import com.amos.util.LinkedNode;
import com.amos.util.SingleLinkedList;

/**
 * @Title: LeetCode2_AddTwoNumbers
 * @Description: 两数相加
 */
public class LeetCode2_AddTwoNumbers {

    /**
     * 给出两个非空的链表用来表示两个非负的整数，其中他们各自的位数是按照逆序的方式存储，并且它们的每个节点只能存储一位数字
     * 如果我们将这两个数相加起来，则会返回一个新的链表来表示他们的和
     * 例如：（2->4->3）+(5->6->7->1)=(7->0->1->2)
     * 原因：342+465=807
     */
    public static void main(String[] args) {

        /**
         * 初始化两个链表
         */
        SingleLinkedList l1 = new SingleLinkedList();

        l1.addLinkedNode(new LinkedNode(8));


        SingleLinkedList l2 = new SingleLinkedList();

        l2.addLinkedNode(new LinkedNode(2));
        l2.addLinkedNode(new LinkedNode(0));
        l2.addLinkedNode(new LinkedNode(1));


        /**
         * 结果写入到新的链表
         */
        SingleLinkedList dummy = new SingleLinkedList();
        LinkedNode curr = dummy.getHead();

        LinkedNode node1 = l1.getHead().next;
        LinkedNode node2 = l2.getHead().next;


        int carry = 0;
        while (node1 != null || node2 != null) {
            int sum = 0;
            if (node1 != null) {
                sum += node1.data;
                node1 = node1.next;
            }
            if (node2 != null) {
                sum += node2.data;
                node2 = node2.next;
            }
            sum += carry;
            LinkedNode node = new LinkedNode(sum % 10);

            curr.next = node;
            carry = sum / 10;
            curr = curr.next;

        }

        if(carry>0){
            curr.next=new LinkedNode(carry);
        }
        dummy.showLinkedList(dummy.getHead());


    }


}

