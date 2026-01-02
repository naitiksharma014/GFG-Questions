class Solution {
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        
        int low = 0, mid = 0, high = n - 1;
        
        while(mid <= high){
            
            if(arr[mid] == 0){
                
                //0 should be at starting
                //SWAP -> Mid and Low
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                
                low++;
                mid++;
            }
            
            else if(arr[mid] == 1){
                
                //1 should be at middle, no action required
                mid++;
            }
            
            else{
                
                //2 should be at last
                //SWAP -> Mid and High
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                
                high--;
            }
        }
    }
}