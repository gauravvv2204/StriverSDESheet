//https://leetcode.com/problems/palindrome-linked-list/submissions/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)
            return true;
        
        //reaching the middle
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = dummy;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        //reversing the half part
        ListNode head2;
        if(fast==null){
            head2 = slow.next;
        }
        else{
            head2 = slow.next.next;
        }
        slow.next = null;
        ListNode ref = head;
        ListNode prev = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        
        //verifying if reversed half part is equal to second part or not.
        head = prev;
        while(head!=null && head2!=null){
            if(head.val!=head2.val)
                return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
}
