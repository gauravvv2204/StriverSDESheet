//https://www.codingninjas.com/codestudio/problems/1112655?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.* ;
import java.io.*; 
/****************************************************************

       Following is the class structure of the Node class:

       class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

*****************************************************************/
public class Solution {
	public static Node flattenLinkedList(Node start) {
        Node dummy = new Node(-1);
        if(start.next==null){
            dummy.child = start;
        }
        Node temp = start;
        while(temp.next!=null){
            Node pointer = dummy;
            Node l1 = temp;
            Node l2 = temp.next;
            Node next = temp.next.next;
            l1.next = null;
            while(l1!=null && l2!=null){
                if(l1.data<=l2.data){
                    pointer.child = l1;
                    pointer = pointer.child;
                    l1 = l1.child;
                }
                else{
                    pointer.child = l2;
                    pointer = pointer.child;
                    l2 = l2.child;
                }
            }
            while(l1!=null){
                pointer.child = l1;
                pointer = pointer.child;
                l1 = l1.child;
            }
            while(l2!=null){
                pointer.child = l2;
                pointer = pointer.child;
                l2 = l2.child;
            }
            temp = dummy.child;
            temp.next = next;
        }
        Node pointer = dummy.child;
        while(pointer.child!=null){
            pointer.next = pointer.child;
            pointer = pointer.next;
        }
        return dummy.child;
	}
}

