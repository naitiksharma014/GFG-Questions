class Solution {
    int n1,n2,n3;
    
    public boolean solve(String s1 , String s2){
        int n = s1.length();
        int j = 0;
        for(int i = 0; i < n3; i++){
            if (j >= n) break;
            if(j < n && s1.charAt(j) == s2.charAt(i)) j++;
        }
        if(j == n) return true;
        return false;
    }
    
    public boolean isInterleave(String s1, String s2, String s3) {
        n1 = s1.length();
        n2 = s2.length();
        n3 = s3.length();
        
        if((n1 + n2) != n3) return false;
        
        if(solve(s1 , s3) && solve(s2 , s3)) return true;
        return false;
    }
}