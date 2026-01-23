class Solution {
    private int solve(int n, int k){
        if(n == 1) return 0;
        
        return (solve(n - 1, k) + k) % n;
    }
    
    public int josephus(int n, int k) {
     
        return solve(n, k) + 1; // convert 0-based -> 1-based
    }
}