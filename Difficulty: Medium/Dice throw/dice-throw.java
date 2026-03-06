// TC: O(n × x × m)
// SC: O(n × x)

class Solution {
    static int[][] dp;
    
    static int solve(int m, int n, int x){
        if(x < 0){
            return 0;
        }
        
        if(n == 0){
            return x == 0 ? 1 : 0;
        }
        
        if(dp[n][x] != -1){
            return dp[n][x];
        }
        
        int ways = 0;
        for(int face = 1; face <= m; face++){
            
            ways += solve(m, n - 1, x - face);
        }
        
        return dp[n][x] = ways;
    }
    static int noOfWays(int m, int n, int x) {
        // code here
        dp = new int[51][51];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        
        return solve(m, n, x);
    }
};