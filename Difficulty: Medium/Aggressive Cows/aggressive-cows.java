// TC: O(n logn) * n

class Solution {
    int n;
    
    public boolean isPossible(int[] stalls, int c, int mid) {
        int cows = 1;
        int lastCowPosition = stalls[0];
        
        for(int i = 1; i < n; i++) {
            
            if(stalls[i] - lastCowPosition >= mid) {
                lastCowPosition = stalls[i];
                cows++;
            }
            
            if(cows == c) {
                return true;
            }
        }
        
        return false;
    }
    
    public int aggressiveCows(int[] stalls, int c) {
        // code here
        n = stalls.length;
        
        Arrays.sort(stalls);
        
        int l = 0, h = stalls[n - 1] - stalls[0];
        int ans = -1;
        
        while(l <= h) {
            
            int mid = l + (h - l) / 2;
            
            if(isPossible(stalls, c, mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        
        return ans;
    }
}