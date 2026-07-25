/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

// Time: O(N log N)
// Space: O(N)

class Pair {
    Node root;
    int hd;
    
    Pair(Node root, int hd) {
        this.root = root;
        this.hd   = hd;
    }
}

class Solution {
    TreeMap<Integer, Integer> map = new TreeMap<>();
    
    public void solve(Node root) {
        if(root == null) {
            return;
        }
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            
            Node currRoot = curr.root;
            int        hd = curr.hd;
            
            map.put(hd, currRoot.data);
            
            if(currRoot.left != null) {
                q.add(new Pair(currRoot.left, hd - 1));
            }
            if(currRoot.right != null) {
                q.add(new Pair(currRoot.right, hd + 1));
            }
        }
    }
    
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        
        solve(root);
        
        for(int value: map.values()) {
            list.add(value);
        }
        
        return list;
    }
}