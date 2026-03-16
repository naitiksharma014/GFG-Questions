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

// TC: O(n)
// SC: O(n)

class Solution {
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    
    public void dfs(Node root, int k, int currSum){
        if(root == null){
            return;
        }
        
        currSum += root.data;
        
        if(currSum == k){
            count++;
        }
        if(map.containsKey(currSum - k)){
            count += map.get(currSum - k);
        }
        
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        
        dfs(root.left, k, currSum);
        dfs(root.right, k, currSum);
        
        map.put(currSum, map.get(currSum) - 1);
    }
    
    public int countAllPaths(Node root, int k) {
        // code here
        dfs(root, k, 0);
        
        return count;
    }
}