class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> span = new ArrayList<>(n);
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                // previous <= current
                st.pop();
            }
            
            if(st.isEmpty()){
                span.add(i + 1);;
            }
            else{
                span.add(i - st.peek());
            }
            
            st.push(i);
        }
        
        return span;
    }
}