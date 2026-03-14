/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
// TC: O(n)
// SC: O(n)

class pair {
    Node root;
    int index;
    
    pair(Node root, int index){
        this.root = root;
        this.index = index;
    }
}

class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        
        Map<Integer, Node> map = new HashMap<>();
        Queue<pair> q = new LinkedList<>();
        int min = 0, max = 0;
        
        q.add(new pair(root, 0));
        //q.add(new pair(null));
        
        while(!q.isEmpty()){
            
            pair curr = q.poll();
            Node currRoot = curr.root;
            int currIdx = curr.index;
            
            if(!map.containsKey(currIdx)){
                map.put(currIdx, currRoot);
            }
            
            if(currRoot.left != null){
                min = Math.min(min, currIdx - 1);
                q.add(new pair(currRoot.left, currIdx - 1));
            }
            
             if(currRoot.right != null){
                max = Math.max(max, currIdx + 1);
                q.add(new pair(currRoot.right, currIdx + 1));
            }
        }
        
        for(int i = min; i <= max; i++){
            Node r = map.get(i);
            res.add(r.data);
        }
        
        return res;
        
    }
}