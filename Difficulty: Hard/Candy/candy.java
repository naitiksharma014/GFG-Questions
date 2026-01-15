class Solution {
    public int minCandy(int arr[]) {
        // code here
        int n = arr.length;
        int[] count = new int[n];
        Arrays.fill(count, 1);
        
        // Left to Right
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i - 1]){
                count[i] = Math.max(count[i], count[i - 1] + 1);
            }
        }
        
        //Right to Left
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > arr[i + 1]){
                count[i] = Math.max(count[i], count[i + 1] + 1);
            }
        }
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += count[i];
        }
        
        return sum;
    }
}
