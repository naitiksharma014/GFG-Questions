class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int low = 0, high = n - 1;
        
        while(low <= high){
            
             // If already sorted
            if (arr[low] <= arr[high]) 
                return low;
            
            int mid = low + (high - low) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            
            if(arr[prev] >= arr[mid] && arr[mid] <= arr[next]){
                return mid;
            }
            else if(arr[low] <= arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
            
        }
        
        return 0;
    }
}