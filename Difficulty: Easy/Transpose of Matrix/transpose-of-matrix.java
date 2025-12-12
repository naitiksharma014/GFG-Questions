class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int n = mat.length;
        
        for(int i = 0; i < n; i++){
            
            for(int j = i + 1; j < n; j++){
                
                
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
                
            }
        }
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            
            ArrayList<Integer> temp = new ArrayList<>(); 
            
            for (int j = 0; j < n; j++) {
                
                temp.add(mat[i][j]);
                
            }
            
            list.add(temp);
        }
        
        return list;
    }
}