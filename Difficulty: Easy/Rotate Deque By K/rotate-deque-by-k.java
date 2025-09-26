class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        while(k > 0){
            
            if(type == 1){
                
                int lastE = dq.removeLast();
                dq.addFirst(lastE);
            }
            
            else{
                
                int firstE = dq.removeFirst();
                dq.addLast(firstE);
            }
            
            k--;
        }
    }
}