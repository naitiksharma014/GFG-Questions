class Solution {
    public boolean stringStack(String pat, String tar) {
        // code here
        int n = pat.length();
        int m = tar.length();
        int i = n - 1 , j = m - 1;
        
        while(i >= 0 && j >= 0){
           if (pat.charAt(i) == tar.charAt(j)) {
                j--;
                i--;
            }
            else i = i - 2;
        }
        
        
        return j < 0;
    }
}
