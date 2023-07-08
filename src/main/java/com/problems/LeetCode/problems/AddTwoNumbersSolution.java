package com.problems.LeetCode.problems;

public class AddTwoNumbersSolution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(4, new ListNode(5, new ListNode(6)));

        ListNode result = addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, currentNode = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            currentNode.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(){}
        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
