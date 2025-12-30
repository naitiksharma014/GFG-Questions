/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    private Node removeLeadingZeros(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        return (head == null) ? new Node(0) : head;
    }
    
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        head1 = reverseList(head1);
        head2 = reverseList(head2);
        
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0, sum = 0;
        
        while(head1 != null || head2 != null || carry != 0){
            sum = carry;
            
            if(head1 != null){
                sum += head1.data;
                head1 = head1.next;
            }
            
            if(head2 != null){
                sum += head2.data;
                head2 = head2.next;
            }
            
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }
        
        Node result = reverseList(dummy.next);
        
        return removeLeadingZeros(result);
    }
}