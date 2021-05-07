public class rotate {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        ListNode tmp = head;
        int l = 1;
        while (tmp.next != null) {
            l++;
            tmp = tmp.next;
        }
        tmp.next = head;
        if (k >= l)
            k = k % l;
        k = l - k;
        while (k-- != 0) {
            tmp = tmp.next;

        }
        head = tmp.next;
        tmp.next = null;
        return head;
    }
}