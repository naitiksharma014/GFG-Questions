class Solution {
    public int maxSum(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
       
        for( int i=1 ; i<n ; i++ ){
           
           max = Math.max( max , arr[i-1] + arr[i] );
        }
        
        return max;
    }    

}    
