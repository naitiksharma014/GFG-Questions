/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        int count0 = 0 , count1 = 0 , count2 = 0;
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0){
                count0++;
            }    
            if(temp.data == 1){
              count1++;  
            } 
            if(temp.data == 2){
                count2++;
            }    
            temp = temp.next;
        }
        
        temp = head;
        
        while( count0 != 0){
            temp.data = 0;
            temp = temp.next;
            count0--;
        }
        
        while( count1 != 0){
            temp.data = 1;
            temp = temp.next;
            count1--;
        }
        
        while( count2 != 0){
            temp.data = 2;
            temp = temp.next;
            count2--;
        }
        return head;
    }
}