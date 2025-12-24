class Solution {
    int n;
    
        public int findPivot(int[] arr){
        int s = 0, e = n - 1;
        
        while(s < e){
            
            int mid = s + (e - s) / 2;
            
            if(arr[mid] > arr[e]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }
        
        return s;
    }
    
    public int binarySearch(int[] arr, int x, int s, int e){
        int start = s;
        int ans = start - 1;
        
        while(s <= e){
            
            int mid = s + (e - s) / 2;
            
            if(arr[mid] <= x){
                ans = mid;        // mid is valid
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        
        return ans - start + 1;
    }

    public int countLessEqual(int[] arr, int x) {
        // code here
        n = arr.length;
        
        //FIND PIVOT ELEMENT
        int pivot = findPivot(arr);
        
        //COUNT = (0, pivot - 1) + (pivot, n - 1)
        int count = binarySearch(arr, x, 0, pivot - 1) + binarySearch(arr, x, pivot, n - 1);
        
        return count;
    }
}
