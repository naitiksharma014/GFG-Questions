// Time: O(n)
// Space: O(k) (stack only)

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if (q == null || k <= 0 || k > q.size()) {
            return q;
        }

        int n = q.size();
        
        // Step 1: push first k elements
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < k; i++) {
            st.push(q.poll());
        }
        
        // Step 2: add back reversed
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        
        // Step 3: move remaining elements to back
        k = n - k;
        while(k--> 0) {
            q.add(q.poll());
        }
        
        return q;
    }
}