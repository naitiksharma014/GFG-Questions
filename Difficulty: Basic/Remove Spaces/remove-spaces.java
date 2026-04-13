class Solution {
    String removeSpaces(String s) {
        // code here
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        
        for(char c: s.toCharArray()) {
           
           if(c != ' ') {
                sb.append(c);
           }
        }
        
        return sb.toString();
    }
}