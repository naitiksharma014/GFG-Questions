class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        
        int[][] items = new int[n][2];

        for (int i = 0; i < n; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
        }
        
        Arrays.sort(items, (a, b) ->
            Double.compare(
                (double)b[0] / b[1],
                (double)a[0] / a[1]
            )
        );
        
        double ans = 0.0;
        
        for(int[] item: items) {
            
            int v = item[0];
            int w   = item[1];
            
            if(capacity >= w) {
                
                ans += v;
                capacity -= w;
                
            } else {
                
                ans += ( (double) v * (capacity) / w);
                
                break;
            }
        }
        
        return ans;
    }
}