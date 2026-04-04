// ⏱️ TC: O(n · 2ⁿ)
// 💾  SC: O(n · 2ⁿ)

class Solution {
    public ArrayList<String> graycode(int n) {
        // code here
        if(n == 1) {
             return new ArrayList<>(Arrays.asList("0", "1"));
        }
        ArrayList<String> res = graycode(n - 1);
        
        ArrayList<String> result = new ArrayList<>();
        
        for(int i = 0; i < res.size(); i++) {
           
            String s = res.get(i);
            result.add("0" + s);
        }
        
        for(int i = res.size() - 1; i >= 0; i--) {
           
            String s = res.get(i);
            result.add("1" + s);
        }
        
        return result;
    }
}