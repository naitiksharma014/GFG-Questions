// TC: O(n)
// SC: O(n)

class Solution {
    int MOD = 1000000007;
    
    public void getNSL(int[] arr, int[] NSL){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            
            if(st.isEmpty()){
                NSL[i] = -1;
            } else {
                
                // Pop all elements strictly > arr[i]  (handles duplicates)
                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                    st.pop();
                }
                    
                NSL[i] = st.isEmpty() ? -1 : st.peek();    
            }
            
            st.push(i);
        }
    }
    
    public void getNSR(int[] arr, int[] NSR){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--){
            
            if(st.isEmpty()){
                NSR[i] = n;
            } else {
                
                // Pop all elements strictly > arr[i]  
                while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                    st.pop();
                }
                
                NSR[i] = st.isEmpty() ? n : st.peek(); 
            }
            
            st.push(i);
        }
    }
    
    public int sumSubMins(int[] arr) {
        // code here
        int n = arr.length;
        
        int[] NSL = new int[n];
        getNSL(arr, NSL);
        
        int[] NSR = new int[n];
        getNSR(arr, NSR);
        
        long totalSum = 0;
        
        
        for(int i = 0; i < n; i++){
            
            long ls = i - NSL[i];
            long rs = NSR[i] - i;
            
            long totalWays = ls * rs;
            
            long sum = totalWays * arr[i];
            
            totalSum = (totalSum + sum) % MOD;
        }
        
        return (int) totalSum;
        
    }
}
