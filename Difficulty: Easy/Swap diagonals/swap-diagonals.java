class Solution {
    public void swapDiagonal(int[][] mat) {
        // code here
        int n = mat.length;
        
        for(int i = 0; i < n; i++){
            
            //swap
            int temp = mat[i][i];
            mat[i][i] = mat[i][n - i - 1];
            mat[i][n - i - 1] = temp; 
        }
        
    }
}