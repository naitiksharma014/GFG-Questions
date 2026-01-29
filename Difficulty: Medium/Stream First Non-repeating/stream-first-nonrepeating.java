class Solution {
    public String firstNonRepeating(String s) {
        // code here
        int n = s.length();
        
        int[] map = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder st = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            
            map[ch - 'a']++;
            q.offer(ch);
            
            
            // remove repeating characters from front
            while(!q.isEmpty() && map[q.peek() - 'a'] > 1){
                q.poll();
            }
            
            
            // append result for current prefix
            if(q.isEmpty()){
                st.append('#');
            } else {
                st.append(q.peek());
            }
        }
        
        return st.toString();
    }
}