class Solution {
    int m, n;
    int[][] dirns = { {-1, 0}, {1, 0}, {0, 1}, {0, -1} };
    public boolean found(int i, int j, int idx, char[][] mat, String word){
        if(idx == word.length()){
            return true;
        }
        
        if(i < 0 || j < 0 || i >= m || j >= n || mat[i][j] == '$'){
            return false;
        }
        
        if(word.charAt(idx) != mat[i][j]){
            return false;
        }
        
        char temp = mat[i][j];
        mat[i][j] = '$';
        
        
        for(int[] dirn: dirns){
            
            int new_i = i + dirn[0];
            int new_j = j + dirn[1];
            
            if(found(new_i, new_j, idx + 1, mat, word)){
                return true;
            }
        }
        
        mat[i][j] = temp;
        
        return false;
        
    }
    public boolean isWordExist(char[][] mat, String word) {
        // Code here
        m = mat.length;     // Row
        n = mat[0].length;  // Col
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                
                if(mat[i][j] == word.charAt(0) && found(i, j, 0, mat, word)){
                    return true;
                }
                
            }
        }
        
        return false;
    }
}