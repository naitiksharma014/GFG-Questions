// TC: O(n)
// SC: O(26) ≈ O(1)

class Solution {
    public static String minWindow(String s, String p) {
        // code here
        
        int n = s.length();
        int m = p.length();
        
        if(n < m){
            return "";
        }
        
        int[] freq = new int[26];
        for(char ch: p.toCharArray()){
            freq[ch - 'a']++;
        }
        
        int i = 0, j = 0;
        int required = m;
        int start_i = 0;
        int minWindow = Integer.MAX_VALUE;
        
        
        while(j < n){
            
            char ch = s.charAt(j);
            
            if(freq[ch - 'a'] > 0){      // Found p char in s
                required--;
            }
            
            freq[ch - 'a']--;
            
            while(required == 0){
                
                int currWindow = j - i + 1;
                
                if(minWindow > currWindow){
                    minWindow = currWindow;
                    start_i   = i;
                }
                
                char c = s.charAt(i);
                
                freq[c - 'a']++;
                
                if(freq[c - 'a'] > 0){
                    required++;
                }
                
                i++;
            }
            
            j++;
        }
        
        if(minWindow == Integer.MAX_VALUE){
            return "";
        }
        
        return s.substring(start_i, start_i + minWindow);
    }
}