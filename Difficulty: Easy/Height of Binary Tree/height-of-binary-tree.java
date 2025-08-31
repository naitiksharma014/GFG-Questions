/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    int Height(Node node){
        if(node == null) return 0;

        int leftD = Height(node.left);
        int rightD = Height(node.right);
        
        return Math.max(leftD , rightD) + 1;
    }
    
    int height(Node node){
       if(node == null) return 0;
       
       return Height(node) - 1;
    }
}
