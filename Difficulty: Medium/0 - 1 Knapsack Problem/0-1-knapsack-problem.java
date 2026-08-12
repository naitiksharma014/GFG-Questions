// States: (i, w) → n × (W+1)
// Time: O(n × W)
// Space: O(n × W) + O(n) recursion stack

class Solution {
    int n;
    int[][] dp;
    
    public int solve(int[] val, int[] wt, int w, int i) {
        if(w == 0 || i == n) {
            return 0;
        }
        
        if(dp[i][w] != -1) {
            return dp[i][w];
        }
        
        int take = 0;
        if(wt[i] <= w) {
            take = val[i] + solve(val, wt, w - wt[i], i + 1);
        }
        
        int skip = solve(val, wt, w, i + 1);
        
        return dp[i][w] = Math.max(take, skip);
    }
    
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        n = wt.length;
        if(W == 0 || n == 0) {
            return 0;
        }
        
        dp = new int[n][W + 1];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        
        return solve(val, wt, W, 0);
    }
}
