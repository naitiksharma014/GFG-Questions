class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        int prefix = 0;
        int maxLen = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            
            prefix += (arr[i] > k) ? 1 : -1;
            
            // case 1: starting from idx 0
            if(prefix > 0){
                maxLen = i + 1;
            }
            
            // case 2: check earlier prefix
            else{
                
                if(map.containsKey(prefix - 1)){
                    maxLen = Math.max(maxLen, i - map.get(prefix - 1));
                }
            }
            
            
            // store first occurrence only
            map.putIfAbsent(prefix, i);
        }
        
        return maxLen;
    }
}