//https://leetcode.com/problems/merge-two-sorted-lists/submissions/
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        ListNode one = list1;
        ListNode two = list2;
        while(one!=null && two!=null)
        if(one.val<=two.val){
            dummy.next = one;
            dummy = dummy.next;
            one = one.next;
        }
        else{
            dummy.next = two;
            dummy = dummy.next;
            two = two.next;
        }
        if(one!=null) dummy.next = one;
        else if(two!=null) dummy.next = two;
        return head.next;
    }
}
