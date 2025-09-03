/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node curr = head;
        Node temp = null; //Swap
        
        if(head == null || head.next == null) return head;
        
        while(curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            
            curr = curr.prev;
        }
        
        if(temp != null){
            head = temp.prev;
        }
        return head;
    }
}