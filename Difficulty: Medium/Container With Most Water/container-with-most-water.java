class Solution {
    public int maxWater(int arr[]) {
        // Code Here
       int n = arr.length;
       
       if(n < 2) return 0;
       
       int l = 0 , r = n - 1;
       
       int maxArea = Integer.MIN_VALUE;
       int Area = 0;
       
       while(l < r){
           int L = Math.min(arr[l] , arr[r]);
           sum = L * (r - l);
           
           max = Math.max(max , sum);
           
           if(arr[l] < arr[r]) l++;
           else r--;
        }
        return max;
    }
}