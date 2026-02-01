class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            
            // Remove out-of-window indices
            if(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }
            
            // Remove smaller elements
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.pollLast();
            }
            
            dq.offerLast(i);
            
            // Add result once window is ready
            if(i >= k - 1){
                list.add(arr[dq.peekFirst()]);
            }
        }
        
        return list;
    }
}