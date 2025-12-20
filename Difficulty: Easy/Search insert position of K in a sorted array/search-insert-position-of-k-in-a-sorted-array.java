//---------------------------------------------------------( APPORACH - 2 )---------------------------------------------------------------------
//TC: O(n)

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


//---------------------------------------------------------( APPORACH - 2 )---------------------------------------------------------------------
// TC: O(logn)
//BINARY SEARCH



class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int n = arr.length;
        
        //BINARY SEARCH
        int l = 0, r = n - 1;
        
        while(l <= r){
            
            int mid = l + (r - l) / 2;
            
            if(arr[mid] == k) return mid;
            
            else if(arr[mid] < k){
                l = mid + 1;
            }
            
            else{
                r = mid - 1;
            }
        }
        
        return l;
    }
};
