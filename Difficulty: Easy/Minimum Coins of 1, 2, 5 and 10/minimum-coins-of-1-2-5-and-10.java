class Solution {
    public int findMin(int n) {
        // code here
        int coin = 0;
        
        while(n != 0) {
            
            if(n >= 10) {
                n -= 10;
                coin++;
            }
            else if(n >= 5) {
                n -= 5;
                coin++;
            }
            else if(n >= 2) {
                n -= 2;
                coin++;
            }
            else if(n == 1){
                n -= 1;
                coin++;
            }
        }
        
        return coin;
    }
}
