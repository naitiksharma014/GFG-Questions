class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int j = k;
        int n = arr.length;
        
        int sum = 0;
        
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        
        int i = 0, Msum = sum;
        
        while(j < n){
            
            sum = sum - arr[i] + arr[j];
            
            Msum = Math.max(sum, Msum);
            i++;
            j++;
        }
        return Msum;
    }
}