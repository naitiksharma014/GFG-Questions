/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int c0 = 0 , c1 = 0 , c2 = 0;
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0) c0++;
            else if(temp.data == 1) c1++;
            else c2++;
            
            temp = temp.next;
        }
        
        temp = head;
        
        while(c0 != 0){
            temp.data = 0;
            temp = temp.next;
            c0--;
        }
        while(c1 != 0){
            temp.data = 1;
            temp = temp.next;
            c1--;
        }
        while(c2 != 0){
            temp.data = 2;
            temp = temp.next;
            c2--;
        }
        
        
        return head;
    }
}