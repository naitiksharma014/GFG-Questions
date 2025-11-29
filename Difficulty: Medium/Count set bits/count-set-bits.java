class Solution {
    public static int largestPowerOf2(int n){
        int x = 0;
        
        while( (1 << x) <= n ){
            x++;
        }
        
        return x - 1;
    }
    public static int countSetBits(int n) {
        // code here
        if(n == 0) return 0;
        
        int x = largestPowerOf2(n);
        
        int till_x = x * (1 << (x - 1));
        int MSBafter_x = n - (1 << x) + 1;
        int rest = countSetBits(n - (1 << x));
        
        return till_x + MSBafter_x + rest;
    }
}