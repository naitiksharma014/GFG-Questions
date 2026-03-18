/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
// Time Complexity: O(n)
// Space Complexity: O(h) (recursion stack)

class Solution {
    int moves = 0;
    
    public int solve(Node root){
        if(root == null){
            return 0;
        }
        
        int l = solve(root.left);
        int r = solve(root.right);
        
        moves += Math.abs(l) + Math.abs(r);
        
        return (l + r + root.data) - 1;
    }
    
    public int distCandy(Node root) {
        // code here
        
        solve(root);
        
        return moves;
    }
}