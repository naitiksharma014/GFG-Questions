// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int num = n;
        
        while(num > 0){
            int digit = num % 10;
            if(digit != 0 && n % digit == 0){
                count++;
            }
            num = num / 10;
        }
        
        return count;
    }
}