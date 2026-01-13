class Solution {
    public boolean canServe(int[] arr) {
        // code here
        int n = arr.length;
        int count5 = 0, count10 = 0, count20 = 0;
        
        for(int num: arr){
            
            if(num == 5) count5++;
            
            else if(num == 10){
                
                if(count5 <= 0) return false;
                
                count5--;
                count10++;
            }
            
            else{
                
                if(count10 >= 1 && count5 >= 1){
                    count10--;
                    count5--;
                }
                
                else if(count5 >= 3){
                    count5 -= 3;
                }
                
                else{
                    return false;
                }
            }
        }
        
        return true;
    }
}