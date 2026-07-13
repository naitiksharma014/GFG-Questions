// Time: O(n²)
// Auxiliary Space (recursion): O(n)

class Solution {
    public void insert(Stack<Integer> st, int x) {
        
        // If stack is empty OR x is greater than top
        if(st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }
        
        // Smaller Value is Coming
        
        // Remove top
        int top = st.pop();
        
        // Insert x in remaining stack-> Recursive call for other
        insert(st, x);
        
        // Put removed element back
        st.push(top);
    }
    
    public void sortStack(Stack<Integer> st) {
        // code here
        
        // Base case
        if(st.isEmpty()) {
            return;
        }
        
        // Remove top element
        int top = st.pop();
        
        // Sort remaining stack -> Recursive call for other elements
        sortStack(st);
        
        // Insert removed element correctly
        insert(st, top);
    }
}