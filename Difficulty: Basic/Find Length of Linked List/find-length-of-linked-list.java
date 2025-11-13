/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        if()
        int len = 0;
        Node temp = head;
        
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        return len;
    }
}