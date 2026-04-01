// DP + Memorization
// ⏱️ TC: O(n)
// 💾 Sc: O(n)

class Solution {
    Integer[][] dp = new Integer[45][2];
    
    int solve(int n, int isOne) {
        if(n == 0) {
            return 1;
        }
        
        if(dp[n][isOne] != null) {
            return dp[n][isOne];
        }
        
        int count = 0;
        
        if(isOne == 1) {
            
           count = solve(n - 1, 0);
    
        } else {
            
            count = solve(n - 1, 0) + solve(n - 1, 1);
        }
        
        return dp[n][isOne] = count;
    }
    
    int countStrings(int n) {
        // code here
        return solve(n, 0);
    }
}