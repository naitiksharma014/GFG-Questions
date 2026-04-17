class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        int n = s.length();
        int[] freq = new int[26];
        
        for(char ch: s.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        int oddCount = 0;
        
        for(int i = 0; i < 26; i++) {
            if(freq[i] % 2 != 0) {
                oddCount++;
            }
        }
        
        return oddCount <= 1;
    }
}