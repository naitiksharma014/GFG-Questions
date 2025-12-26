//---------------------------------------------------------------( APPROACH - 1 )-------------------------------------------------------------------------------
//TC : O(n)
//Brute Force

class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n = arr.length;
        int j = 0;
        int count = 0;
        
        for(int i = 1; i <= arr[n - 1]; i++){
           
          
            if(j < n && i == arr[j]){
                
                j++;
            }
            
            else{
                
                k--;
                
                if(k == 0) return i;
            }
           
        }
        
        return arr[n - 1] + k;
    }
}




//---------------------------------------------------------------( APPROACH - 1 )-------------------------------------------------------------------------------
//TC : O(log n)
//BINARY SEARCH

class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n = arr.length;
        int low = 0, high = n - 1;
        
        while(low <= high){
            
            int mid = low + (high - low) / 2;
            
            int missing = arr[mid] - (mid + 1);
            
            if(missing < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return low + k;
    }
}
