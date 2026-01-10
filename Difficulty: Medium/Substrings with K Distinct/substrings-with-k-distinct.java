class Solution {
    int n;
    
    public int atMostK(String s, int k){
        if (k < 0) return 0;
         
        int ans = 0, left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int right = 0; right < n; right++){
            
            char c = s.charAt(right);
            
            map.put(c, map.getOrDefault(c , 0) + 1);
            
            while(map.size() > k){
                
                char ch = s.charAt(left);
                
                map.put(ch, map.get(ch) - 1);
                
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                
                left++;
            }
            
            ans += (right - left + 1);
        }
        
        return ans;
    }
    
    public int countSubstr(String s, int k) {
        //  code here
        n = s.length();
        return atMostK(s, k) - atMostK(s, k - 1);
    }
}