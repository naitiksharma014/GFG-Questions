class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        if(arr[0] == 0) return -1;
        
        int max = 0 , jump = arr[0] , ans = 1;
        
        for(int i = 1; i < n ; i++){
            
            max--;
            jump--;
            
            max = Math.max(max , arr[i]);
            
            if(jump == 0 && i != n - 1){
                
                if(max <= 0) return -1;
                
                jump = max;
                max = 0;
                ans++;
            }
            
        }
        
        return ans;
    }
}