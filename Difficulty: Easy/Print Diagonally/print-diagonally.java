// TC: O(n²)
// SC O(n²)

class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        int n = mat.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int j = 0; j < n; j++) {
            
            int row = 0;
            int col = j;
            
            while(row < n && col >= 0) {
                list.add(mat[row][col]);
                
                row++;
                col--;
            }
        }
        
        for(int i = 1; i < n; i++) {
            
            int row = i;
            int col = n - 1;
            
            while(row < n && col >= 0) {
                list.add(mat[row][col]);
                
                row++;
                col--;
            }
        }
        
        return list;
    }
}
