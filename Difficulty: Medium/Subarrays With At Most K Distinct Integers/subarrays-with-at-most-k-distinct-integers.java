class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int n = arr.length;
        int left = 0, ans = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int right = 0; right < n; right++){
            
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            
            while(map.size() > k){
                
                map.put(arr[left], map.get(arr[left]) - 1);
                
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                
                left++;
            }
            
            ans += (right - left + 1);
        }
        
        
        return ans;
    }
}
