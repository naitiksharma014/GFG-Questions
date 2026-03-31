class Solution {
    public int maxProfit(int arr[], int k) {
        int n = arr.length;
        if(n == 0) return 0;

        int hold = -arr[0]; 
        int cash = 0;      

        for(int i = 1; i < n; i++) {
            int prevCash = cash;

            // sell today
            cash = Math.max(cash, hold + arr[i] - k);

            // buy today
            hold = Math.max(hold, prevCash - arr[i]);
        }

        return cash;
    }
}