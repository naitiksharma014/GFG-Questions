// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int row = arr.length;
        int col = arr[0].length;
        int idx = -1;
        int count = 0;
        int one = 0;
        
        for(int i = 0; i < row; i++){
            
            one = 0;
            
            for(int j = 0; j < col; j++){
                
                if(arr[i][j] == 1) one++;
            }
            
            if(one > count){
                idx = i;
                count = one;
            }
        }
        
        return idx;
    }
}