class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        
        int[] freq = new int[26];
        int distinct = 0;
        int maxLen = -1;
        int left = 0;
        
        for(int right = 0; right < n; right++){
            
            if(freq[s.charAt(right) - 'a'] == 0){
                distinct++;
            }
            
            freq[s.charAt(right) - 'a']++;
            
            while(distinct > k){
                
                freq[s.charAt(left) - 'a']--;
                
                if(freq[s.charAt(left) - 'a']  == 0){
                    distinct--;
                }
                
                left++;
            }
            
           if(distinct == k){
                maxLen = Math.max(maxLen, right - left + 1);
           }
        }
        
        return maxLen;
    }
}