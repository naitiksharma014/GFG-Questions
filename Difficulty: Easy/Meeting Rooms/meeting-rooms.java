class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        int m = arr.length;
        int n = arr[0].length;
        
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        
        for(int i = 1; i < m; i++){
            
            int start = arr[i][0];
            int end = arr[i - 1][1];
            
            if(start < end){
                return false;
            }
        }
        
        return true;
    }
}