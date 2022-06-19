//https://leetcode.com/problems/copy-list-with-random-pointer/
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // HashMap<Node,Node> map = new HashMap<>();
        // Node runner = head;
        // while(runner!=null){
        //     map.put(runner,new Node(runner.val));
        //     runner = runner.next;
        // }
        // runner = head;
        // while(runner!=null){
        //     Node temp = map.get(runner);
        //     temp.next = map.get(runner.next);
        //     if(map.get(runner.random)!=null)
        //     temp.random = map.get(runner.random);
        //     runner = runner.next;
        // }
        // return map.get(head);
        Node runner = head;
        while(runner!=null){
            Node temp = new Node(runner.val);
            temp.next = runner.next;
            runner.next = temp;
            runner = runner.next.next;
        }
        
        
        runner = head;
        while(runner!=null){
            if(runner.random!=null)
            runner.next.random = runner.random.next;
            runner = runner.next.next;
        }
        
        
        runner = head;
        Node copy = new Node(0);
        Node prev = copy;
        while(runner!=null){
            prev.next = runner.next;
            prev = prev.next;
            runner.next = prev.next;
            runner = runner.next;
        }
        return copy.next;
    }
}
