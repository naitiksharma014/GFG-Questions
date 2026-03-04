// TC: O(n)
// SC: O(1)

class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        int x = 0;
        
        // first window XOR
        for(int i = 0; i < k; i++){
            
            x ^= arr[i];
        }
        
        int max = x;
        
        // sliding window
        for(int i = k; i < n; i++){
            
            x = x ^ arr[i] ^ arr[i - k];
            
            max = Math.max(x, max);
        }
        
        return max;
    }
}
