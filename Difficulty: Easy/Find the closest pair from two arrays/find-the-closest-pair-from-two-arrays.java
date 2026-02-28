class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        int n = arr1.length;
        int m = arr2.length;
        
        int i = 0, j = m - 1;
        int minDiff = Integer.MAX_VALUE;
        ArrayList<Integer> res = new ArrayList<>(2);
        res.add(0);
        res.add(0);
        
        while(i < n && j >= 0){
            
            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(sum - x);
            
            if(diff < minDiff){
                res.set(0, arr1[i]);
                res.set(1, arr2[j]);
                minDiff = diff;
            }
            
            if(sum < x){
                i++;     // need bigger sum
            } else{
                j--;     // need smaller sum
            }
        }
        
        return res;
    }
}