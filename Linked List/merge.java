// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newhead = null;
        ListNode sorted = l1;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val > l2.val) {
            sorted = l2;
            l2 = l2.next;
        } else
            l1 = l1.next;
        newhead = sorted;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                sorted.next = l1;
                sorted = l1;
                l1 = l1.next;
            } else {
                sorted.next = l2;
                sorted = l2;
                l2 = l2.next;
            }
        }
        if (l1 == null)
            sorted.next = l2;
        if (l2 == null)
            sorted.next = l1;
        return newhead;
    }
}