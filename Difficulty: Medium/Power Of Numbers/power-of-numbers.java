class Solution {
    public int reverseExponentiation(int n) {
       int reverse = 0;
       int num = n;
       
       if(n % 10 == 0) return n;
       
        while(num > 0){
           int digit = n % 10;
           reverse = reverse * 10 + digit;
           num = num / 10;
        }
        
        return (int)Math.pow(n , reverse);
    }
}
