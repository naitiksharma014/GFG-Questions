class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int productStart = 1 , productEnd = 1;
        
        for( int i=0 ; i<n ; i++ ){
            productStart *= arr[i];
            productEnd *= arr[ n-1-i ];
            
            ans = Math.max( ans , Math.max( productStart , productEnd ) );
            
            if( productStart ==0 ) productStart =1;
            if( productEnd ==0 ) productEnd =1;
        }
        return ans;
    }
}