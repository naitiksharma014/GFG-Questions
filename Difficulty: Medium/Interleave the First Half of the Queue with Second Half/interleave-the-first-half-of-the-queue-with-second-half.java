class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int n = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();
        
        for(int i = 0; i < n / 2; i++){
            firstHalf.offer(q.poll());
        }
        
        while(!firstHalf.isEmpty()){
            q.offer(firstHalf.poll());
            q.offer(q.poll());
        }
    }
}
