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
    Node mergeTwoSortedList(Node L1 , Node L2){
        if(L1 == null) return L2;
        if(L2 == null) return L1;
        
        if(L1.data <= L2.data){
            L1.next = mergeTwoSortedList(L1.next , L2);
            return L1;
        }
        
        if(L2.data <= L1.data){
            L2.next = mergeTwoSortedList(L1 , L2.next);
            return L2;
        }
        
        return null;
    }
    
    Node paritionAndMerge(int s, int e, Node[] lists){
        
        if(s > e) return null;
        
        if(s == e) return lists[s];
        
        int mid = s + (e - s)/2;
        
        Node L1 = paritionAndMerge(s , mid , lists);
        Node L2 = paritionAndMerge(mid+1 , e , lists);
        
        return mergeTwoSortedList(L1,L2);
    }
    
    Node mergeKLists(Node[] arr) {
        // code here
       int k = arr.length;
       
       if(k == 0) return null;
       
       return paritionAndMerge(0 , k-1 , arr);
    }
}