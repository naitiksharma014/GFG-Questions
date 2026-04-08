class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;
        int count0 = 0, count1 = 0;
        
        for(int a: arr) {
            if(a == 0) count0++;
            else count1++;
        }
        
        int i = 0;
        while(count0 > 0) {
            arr[i++] = 0;
            count0--;
        }
        
        while(count1 > 0) {
            arr[i++] = 1;
            count1--;
        }
    }
}
