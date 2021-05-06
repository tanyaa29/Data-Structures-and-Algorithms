public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null)
            return false;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        slow.next = reverse(slow.next);
        slow = slow.next;
        fast = head;
        while (slow != null) {
            if (fast.val != slow.val)
                return false;
            slow = slow.next;
            fast = fast.next;

        }
        return true;

    }

    ListNode reverse(ListNode node) {
        ListNode pre = null;
        ListNode next = null;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}class pallindrome {
    
}
