class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        int n = arr.length;
       Set<Integer> set = new HashSet<>();
       ArrayList<Integer> result = new ArrayList<>();
       
       for(int i = 0; i < n; i++){
            
            set.add(arr[i]);
        }
        
        for(int i = 0; i < high - low + 1; i++){
            
            if(!set.contains(i + low)){
                result.add(i + low);
            }
        }
        
        return result;
    }
}