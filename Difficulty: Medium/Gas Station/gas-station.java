class Solution {
    
    public int startStation(int[] gas, int[] cost) {
        
        int total = 0 , tank = 0 , start = 0;

        for (int i = 0; i < gas.length; i++) {
            
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (total < 0) return -1;
        return start;
    }
}
