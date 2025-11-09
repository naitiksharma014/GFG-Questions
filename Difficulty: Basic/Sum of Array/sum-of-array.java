// User function Template for Java

class Solution {
    int solve(int[] arr , int i , int n , int sum){
        if(i == n ) return sum;
        
        return solve(arr , i+1 , n , sum + arr[i]);
    }
    int arraySum(int arr[]) {
        
        return solve(arr , 0 , arr.length , 0);
    }
}
