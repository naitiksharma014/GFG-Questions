class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int n = arr.length;
        int idx = -1;
        boolean found = false;
        
        for(int i = 0; i < n; i++){
            
            if(arr[i] == k){
                idx = i;
                found = true;
                break;
            }
           
            else if(arr[i] < k){
                idx = i;
            }
        }
        
        if(found == false){
            return idx + 1;
        }
        return idx;
        
    }
};