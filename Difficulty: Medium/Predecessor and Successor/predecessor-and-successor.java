/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

// ⏱️ TC: O(H) 
// 💾 SC: O(1) 

class Solution {
    
    public Node rightmostElementInLeft(Node root){
        Node ans = null;
        
        while(root != null){
            ans = root;
            root = root.right;
        }
        
        return ans;
    }
    
    public Node leftmostElementInRight(Node root){
        Node ans = null;
        
        while(root != null){
            ans = root;
            root = root.left;
        }
        
        return ans;
    }
    
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        Node pred = null;   // smaller
        Node succ = null;   // greater
        Node curr = root;
        
        while(curr != null){
            
            if(curr.data < key) {
                pred = curr;
                curr = curr.right;
            }
            else if(curr.data > key) {
                succ = curr;
                curr = curr.left;
            }
            else {
                
                if(curr.left != null){
                    // pred = rightmost element in left
                    pred = rightmostElementInLeft(curr.left);
                }
                if(curr.right != null){
                    // succ = leftmost element in right
                    succ = leftmostElementInRight(curr.right);
                }
                
                break;
            }
        }
        
        ArrayList<Node> ans = new ArrayList<>();
        ans.add(pred);
        ans.add(succ);
        
        return ans;
    }
}