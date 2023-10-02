class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // Return head as is if the list has 0 or 1 nodes
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        if (prev != null) {
            prev.next = slow.next;
        } else {
            head = head.next;
        }

        return head;
    }
}
