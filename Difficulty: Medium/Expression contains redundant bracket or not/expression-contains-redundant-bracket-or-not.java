class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        int n = s.length();
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            
            // push everything except ')'
            if(ch != ')'){
               st.push(ch);
            }
            
            // when we meet ')', check inside the brackets
            else{
               
               boolean hasOperator = false;
               
                while(st.peek() != '('){
                   
                   if(st.peek() == '+' || st.peek() == '-' || st.peek() == '*' || st.peek() == '/'){
                       hasOperator = true;
                    }
                   
                   st.pop();
                }
                
                // Remain pop '('
                st.pop();
            
                // if no operator found -> redundant
                if(!hasOperator) return true;
                }
            
        }
        
        return false;
    }
}
