// TC: O(n)
// SC: O(n)

class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length;
        int preXor = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            
            preXor ^= arr[i];
            
            if(preXor == k){
                count++;
            }
            
            if(map.containsKey(preXor ^ k)){
                count += map.get(preXor ^ k);
            }
            
            map.put(preXor, map.getOrDefault(preXor, 0) + 1);
        }
        
        return count;
    }
}