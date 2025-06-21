// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // SLIDING WINDOW
        
        int n = arr.size();
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
       
       for( int i=0 ; i+m-1 < n ; i++ ){
           min = Math.min( min , arr.get(i+m-1) - arr.get(i) );
       }
       return min;
    }
    
}