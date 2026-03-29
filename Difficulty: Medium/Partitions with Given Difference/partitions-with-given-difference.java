class Solution {
    
    Integer[][] dp;

    public int countPartitions(int[] arr, int diff) {
        int sum = 0;
        for(int x : arr) sum += x;

       
        if(sum < diff || (sum + diff) % 2 != 0) return 0;

        int target = (sum + diff) / 2;

        dp = new Integer[arr.length][target + 1];

        return solve(arr, 0, target);
    }
    
    private int solve(int[] arr, int i, int target) {
       
        if(i == arr.length) {
            return target == 0 ? 1 : 0;
        }

        
        if(dp[i][target] != null) return dp[i][target];

        // Not take
        int notTake = solve(arr, i + 1, target);

        // Take
        int take = 0;
        if(arr[i] <= target) {
            take = solve(arr, i + 1, target - arr[i]);
        }

        return dp[i][target] = take + notTake;
    }
}