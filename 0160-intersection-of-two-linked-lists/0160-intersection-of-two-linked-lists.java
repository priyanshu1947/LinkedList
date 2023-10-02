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

        while(dummyHead1 != dummyHead2)
        {
            dummyHead1 = dummyHead1 == null ? headB : dummyHead1.next;
            dummyHead2 = dummyHead2 == null ? headA : dummyHead2.next;
        }

        return dummyHead1;
        
    }
}