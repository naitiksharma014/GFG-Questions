class Solution {
     public int lastOccurance(int[] arr, int l, int r, int x){
        int ans = -1;
        
        while(l <= r){
            
            int mid = l + (r - l) / 2;
            
            if(arr[mid] == x){
                ans = mid;
                l = mid + 1;
            }
            else if(arr[mid] < x){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        
        return ans;
    }
    public int firstOccurance(int[] arr, int l, int r, int x){
        int ans = -1;
        
        while(l <= r){
            
            int mid = l + (r - l) / 2;
            
            if(arr[mid] == x){
                ans = mid;
                r = mid - 1;
            }
            else if(arr[mid] < x){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        
        return ans;
    }
    public int solve(int[] arr, int l, int r, int x){
        int first = firstOccurance(arr, l, r, x);
        if(first == -1) return 0;
        
        int last = lastOccurance(arr, l, r, x);
        
        return last - first + 1;
    }
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
         ArrayList<Integer> res = new ArrayList<>();

        for(int[] query: queries){
        
            int l = query[0];
            int r = query[1];
            int x = query[2];
            
            
            res.add(solve(arr, l, r, x));
        }
        
        return res;
    }
}