/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if(headA== null || headB == null)
        {
            return null;
        }
        ListNode dummyHead1 = headA;
        ListNode dummyHead2 = headB;

        while (dummyHead1 != dummyHead2) {
            if (dummyHead1 == null) {
                dummyHead1 = headB;
            } else {
                dummyHead1 = dummyHead1.next;
            }

            if (dummyHead2 == null) {
                dummyHead2 = headA;
            } else {
                dummyHead2 = dummyHead2.next;
            }
        }

        return dummyHead1;
        
    }
}