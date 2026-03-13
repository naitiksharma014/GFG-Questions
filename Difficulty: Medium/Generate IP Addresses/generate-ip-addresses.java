class Solution {
    int n;
    ArrayList<String> result = new ArrayList<>();
    
    public boolean isValid(String str){
        int m = str.length();
        
        if(str.length() > 1 && str.charAt(0) == '0'){
            return false;
        }
        
        return Integer.parseInt(str) <= 255;
    }
    
    public void solve(String s, int idx, int parts, String curr){
        if(parts > 4){
            return;
        }
        
        if(idx == n && parts == 4){
            result.add(curr.substring(0, curr.length() - 1));
        }
        
        if(idx + 1 <= n)
            solve(s, idx + 1, parts + 1, curr + s.substring(idx, idx + 1) + ".");
        
        if(idx + 2 <= n && isValid(s.substring(idx, idx + 2)) ){
            solve(s, idx + 2, parts + 1, curr + s.substring(idx, idx + 2) + ".");   
        }
        
        if(idx + 3 <= n && isValid(s.substring(idx, idx + 3)) ){
          solve(s, idx + 3, parts + 1, curr + s.substring(idx, idx + 3) + ".");   
        }
    }
    
    public ArrayList<String> generateIp(String s) {
        // code here
        n = s.length();
        
        if(n > 12) return result;
        
        solve(s, 0, 0, "");
        
        return result;
    }
}