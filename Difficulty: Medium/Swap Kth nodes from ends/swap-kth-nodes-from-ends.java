/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        int n = 0;
        Node temp = head;
        
        while(temp != null){
            n++;
            temp = temp.next;
        }
        
        if(k > n) return head;
        
        temp = head;
        
        Node x = head;
        for(int i = 1 ; i < k ; i++){
            x = x.next;
        }
        
        Node y = head;
        for(int i = 1 ; i < n - k + 1; i++){
            y = y.next;
        }
        
        int t = x.data;
        x.data = y.data;
        y.data = t;
        
        return head;
    }
}
