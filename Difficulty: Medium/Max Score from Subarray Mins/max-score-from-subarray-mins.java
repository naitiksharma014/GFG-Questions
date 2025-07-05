class Solution {
   
    public int MaxScore( int[] arr , int i, int n ){
        return arr[i-1] + arr[i];
    }
    
    public int maxSum(int arr[]) {
        int n = arr.length;
        // int i = 0 , j = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // code here
        
        
        for( int i=1 ; i<n ; i++ ){
            
            sum = MaxScore( arr , i , n );
                
            max = Math.max( max , sum );
            
        }
        
        return max;
        
    }    

}    