class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        // Count Freq 
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--){
            
            int currFreq = freq.get(arr[i]);
            
            while(!st.isEmpty() && freq.get(st.peek()) <= currFreq){
                st.pop();
            }
            
            if(st.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(st.peek());
            }
            st.push(arr[i]);
        }
        
        Collections.reverse(list);
        return list;
    }
}