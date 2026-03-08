// TC: O(n)
// SC: O(1)

class Solution {
    public String largestSwap(String s) {
        // code here
        int n = s.length();
        
        int[] maxRight = new int[10];
        Arrays.fill(maxRight, -1);
        
        for(int i = 0; i < n; i++){
            maxRight[s.charAt(i) - '0'] = i;
        }
        
        for(int i = 0; i < n; i++){
            char currChar = s.charAt(i);
            int currDigit =  currChar - '0';
            
            for(int digit = 9; digit > currDigit; digit--){
                
                if(maxRight[digit] > i){
                    
                    char[] charArray = s.toCharArray();
                    char temp = charArray[i];
                    charArray[i] = charArray[maxRight[digit]];
                    charArray[maxRight[digit]] = temp;
                    
                    return new String(charArray);
                    
                }
            }
        }
        
        return s;
    }
}