class Solution {
    public int minParentheses(String s) {
        // code here
        int n = s.length();
        int open = 0 , close = 0;
        
        for(char ch : s.toCharArray()){
            
            if(ch == '('){
                open++;
            }
            
            else{
                
                if(open > 0) open--;
                else close++;
            }
        }
        
        return open + close;
    }
}
