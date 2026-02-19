class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 1; i < n; i++){
            
            if(arr[i - 1] != arr[i]){
                
                res.add(arr[i - 1]);
            }
        
        }
        
        res.add(arr[n - 1]);
        
        return res;
    }
}
