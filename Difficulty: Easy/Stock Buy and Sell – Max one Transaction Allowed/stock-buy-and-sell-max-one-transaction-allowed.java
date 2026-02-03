class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int n = prices.length;
        int buy = prices[0], profit = 0;
        
        for(int i = 1; i < n; i++){
            
            if(buy > prices[i]){
                buy = prices[i];
            }
            else{
                profit = Math.max(profit, prices[i] - buy);
            }
        }
        
        return profit;
    }
}