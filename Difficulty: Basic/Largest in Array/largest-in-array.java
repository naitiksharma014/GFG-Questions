class Solution {
    public static int largest(int[] arr) {
        // code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        
        return max;
    }
}
