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