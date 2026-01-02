//---------------------------------------------------------------(APPROACH - 1)---------------------------------------------------------------------------------
//Dutch National Flag Algorithm
//TC: O(n) with one pass
//Optimal

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





//---------------------------------------------------------------(APPROACH - 2)---------------------------------------------------------------------------------
//TC: O(n) with multiple pass



class Solution {
    public void sort012(int[] arr) {
        // code here
        int zeros = 0, ones = 0, twos = 0;
        
        for(int num: arr){
            
            if(num == 0) zeros++;
            else if(num == 1) ones++;
            else twos++;
        }
        
        int i = 0;
        while(zeros > 0){
            
            arr[i++] = 0;
            zeros--;
        }
        
        while(ones > 0){
            
            arr[i++] = 1;
            ones--;
        }
        
        while(twos > 0){
            
            arr[i++] = 2;
            twos--;
        }
    }
}
