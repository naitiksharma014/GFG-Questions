/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

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
    public boolean isPalindrome(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node middle = slow; //slow at middle
        
        Node firstHalf = head;
        Node secondHalf = reverseList(middle); //Reverse secondHalf
        
        
        while(firstHalf != null && secondHalf != null){
            
            if(firstHalf.data != secondHalf.data){
                return false;
            }
            
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return true;
    }
}