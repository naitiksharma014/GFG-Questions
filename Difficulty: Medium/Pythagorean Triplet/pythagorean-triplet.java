// Time Complexity: O(n + max(arr[i])²)
// Auxiliary Space: O(max(arr[i]))

class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int n = arr.length;
        
        int max = 1000;
        boolean[] freq = new boolean[max + 1];
        
         // mark numbers present
        for(int x: arr){
            freq[x] = true;
        }
        
        for(int a = 1; a < 1001; a++){
            
            if(!freq[a]) continue;
            
            for(int b = 1; b < 1001; b++){
                
                if(!freq[b]) continue;
                
                int c2 = a * a + b * b;
                int c = (int) Math.sqrt(c2);
                
                if(c * c == c2 && freq[c]){
                    return true;
                }
            }
        }

       
        return false;
        
    }
}