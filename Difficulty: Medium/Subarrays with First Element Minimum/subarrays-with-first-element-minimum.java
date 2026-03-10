// TC: O(n)
// SC: O(n)

class Solution {
    public int countSubarrays(int[] arr) {
        // code here
        int n = arr.length;
        
        Stack<Integer> st = new Stack<>();
        int total = 0;
        
        for(int i = 0; i < n; i++){
            
            // Current element is smaller → it's the NSE for stack top
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                int idx = st.pop();
                total += (i - idx);  // NSE found at i, so count = i - idx
            }
            
            st.push(i);
        }
        
        // Remaining elements in stack have NO NSE → NSE index = n
        while(!st.isEmpty()){
            int idx = st.pop();
            total += (n - idx);
        }
        
        return total;
    }
}
