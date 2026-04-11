// TC: O(n)
// SC: O(1)

class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int n = arr.length;
        int count = 0;
        int len = 1;
        
        for(int i = 1; i < n; i++) {
            
            if(arr[i - 1] < arr[i]) {
                len++;
            } else {
                count += len * (len - 1) / 2;
                len = 1;
            }
        }
        
        // {1, 2, 3, 4, 5} -> else case will never occur
        count += len * (len - 1) / 2;
        
        return count;
    }
}
