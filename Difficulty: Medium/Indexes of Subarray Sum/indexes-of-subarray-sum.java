
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int j = 0;
        int sum = 0;
       
       for(int i=0 ; i<n ; i++){
           sum += arr[i];
           
           while(sum > target && j < i){
                sum -= arr[j++];
            }
           
           if(sum == target){
               res.add(j+1);
               res.add(i+1);
               return res;
            }
            
            
       }
       res.add(-1);
       return res;
    }
}
