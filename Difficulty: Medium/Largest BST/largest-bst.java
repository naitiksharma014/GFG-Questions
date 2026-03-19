// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

// Time Complexity  = O(N)
// Space Complexity = O(H)

class Info {
    int min, max, size;
    
    Info(int min, int max, int size){
        this.min = min;
        this.max = max;
        this.size = size;
    }
}
class Solution {
    
    static Info solve(Node root){
        if(root == null){
            return  new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        
        Info l = solve(root.left);
        Info r = solve(root.right);
        
        if(root.data > l.max && root.data < r.min){
            int currMin = Math.min(root.data, l.min);
            int currMax = Math.max(root.data, r.max);
            int currSize = l.size + r.size + 1;
            
            return  new Info(currMin, currMax, currSize);
        } 
        else{
            return  new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(l.size, r.size));
        }
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        // Write your code here
        Info info = solve(root);
        
        return info.size;
    }
}