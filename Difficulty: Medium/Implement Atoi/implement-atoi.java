class Solution {
    public int myAtoi(String s) {
        // code here
        int n = s.length();
        long ans = 0;
        int sign = 1;
        int i = 0;
        
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        if(i == n) {
            return 0;
        }
        
        if(i < n && s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '+') ? 1 : -1;
            i++;
        } 
        
        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            
            ans = ans * 10 + (s.charAt(i) - '0');
            
            if(sign * ans >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if(sign * ans <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            
            i++;
        }
        
        return (int)(sign * ans);
    }
}