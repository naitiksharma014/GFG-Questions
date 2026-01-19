class Solution {
    public String removeKdig(String s, int k) {
        // code here
        int n = s.length();
        
        if(k == 0) return s;
        if(k >= n) return "0";
        
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            
            // CASE 1 : If current digit is smaller than stack top
            while(k > 0 && !st.isEmpty() && st.peek() > ch){
                st.pop();
                k--;
            }
            
            st.push(ch);
        }
        
        // CASE 2: If k is still left after traversal
        while(k > 0 && !st.isEmpty()){
            
            st.pop();
            k--;
        }
        
        // Stack to StringBuilder
        StringBuilder sb = new StringBuilder();
        
        while(!st.isEmpty()){
            
            sb.append(st.pop());
        }
        
        // Reverse StringBuilder
        sb.reverse();
        
        // Remove Leading Zeros
        int i = 0;
        
        while(i < sb.length() && sb.charAt(i) == '0'){
            i++;
        }
        
        String ans = sb.substring(i);
        
        return ans.length() == 0 ? "0" : ans;
    }
}