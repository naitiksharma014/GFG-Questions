class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
}