// TC: O(n)
// SC: O(1)

class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        int m = s1.length();
        int n = s2.length();
        
        if(m != n){
            return false;
        }
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for(int i = 0; i < m; i++){
            
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            // check mapping s1 -> s2
            if(map1.containsKey(c1)){
                if(map1.get(c1) != c2){
                    return false;
                }
            } 
            else {
                    map1.put(c1, c2);
            }
            
            // check reverse mapping s2 -> s1
            if(map2.containsKey(c2)){
                if(map2.get(c2) != c1){
                    return false;
                }
            }
            else {
                    map2.put(c2, c1);
            }
        }
        
        return true;
    }
}