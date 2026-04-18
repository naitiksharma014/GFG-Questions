class Solution {
    int maxOnes(int[] arr) {
        // code here
       int totalOnes = 0;
       
        for(int num : arr) {
            if(num == 1) totalOnes++;
        }

        // Apply Kadane
        int maxGain = 0, curr = 0;

        for(int num : arr) {
            int val = (num == 0) ? 1 : -1;

            curr = Math.max(val, curr + val);
            maxGain = Math.max(maxGain, curr);
        }

        return totalOnes + maxGain;
    }
    
};