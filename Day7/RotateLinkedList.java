//https://leetcode.com/problems/rotate-list/submissions/
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        ListNode ref = head;
        int n = 1;
        while(ref.next!=null){
            n++;
            ref = ref.next;
        }
        k = k % n;
        if(k==0) return head;
        k = n - k;
        ListNode temp = head;
        for(int i=1; i<k; i++){
            temp = temp.next;
        }
        ListNode ans = temp.next;
        temp.next = null;
        ref.next = head;
        return ans;
    }
}
