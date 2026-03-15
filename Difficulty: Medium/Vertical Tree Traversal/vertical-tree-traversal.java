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
class Pair {
    Node root;
    int level;
    
    Pair(Node root, int level){
        this.root = root;
        this.level = level;
    }
}
class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        q.add(new Pair(root, 0));
        int min = 0, max = 0;
        
        while(!q.isEmpty()){
            
            Pair p = q.poll();
            Node currRoot = p.root;
            int currLevel = p.level;
            
            map.putIfAbsent(currLevel, new ArrayList<>());
            map.get(currLevel).add(currRoot.data);
            
            if(currRoot.left != null){
                min = Math.min(min, currLevel - 1);
                q.add(new Pair(currRoot.left, currLevel - 1));
            }
            
            if(currRoot.right != null){
                max = Math.max(max, currLevel + 1);
                q.add(new Pair(currRoot.right, currLevel + 1));
            }
        }
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for(int i = min; i <= max; i++){
            result.add(map.get(i));
        }
        
        return result;
    }
}