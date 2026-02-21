class Solution {
    public int hIndex(int[] citations) {
        // code here
        int n = citations.length;
        int[] freq = new int[n + 1];
        
        for(int c: citations){
            
            if(c >= n){
                freq[n]++;
            }
            else{
                freq[c]++;
            }
        }
        
        int paper = 0;
        
        for(int i = n; i >= 0; i--){
            
            paper += freq[i];
            
            if(paper >= i){
                return i;
            }
        }
        
        return 0;
    }
}