class Solution {
    Integer[][] dp;
    int sum = 0;
    
    public int solve(int[] arr, int k, int i, int currSum) {
        if(i == arr.length) {
            
            if(k == currSum) {
                return 1;
            } else {
                return 0;
            }
        }
        
        if(dp[i][currSum + sum] != null) {
            return dp[i][currSum + sum];
        }
        
        
        int plus = solve(arr, k, i + 1, currSum + arr[i]);
        int minus = solve(arr, k, i + 1, currSum - arr[i]);
        
        return dp[i][currSum + sum] = plus + minus;
    }
    
    public int totalWays(int[] arr, int target) {
        // code here
        for(int a: arr) {
            sum += a;
        }
        
        dp = new Integer[51][2 *sum + 1];
        
        return solve(arr, target, 0, 0);
    }
}