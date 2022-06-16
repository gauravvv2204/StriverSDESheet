//https://leetcode.com/problems/linked-list-cycle/submissions/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        ListNode fast = head;
        ListNode slow = head;
        do{
            fast=fast.next.next;
            slow = slow.next;
        }while(fast!=null && fast.next!=null && fast!=slow);
        if(slow==fast) return true;
        return false;
    }
}
