class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(n);
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < n ; i++){
            
            res.add(-1);
        }
        
        for(int i = 0 ; i < 2 * n ; i++){
            
            int idx = i % n;
            int num = arr[idx];
            
            while(!st.isEmpty() && num > arr[st.peek()] ){
                
                res.set(st.pop() , num);
            }
            
            if(i < n) st.push(idx);
            
        }
        
        return res;
    }
}