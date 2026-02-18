class Solution {
    static int n;
    
    static int merge(int[] arr, int left, int mid, int right){
        
        List<Integer> temp = new ArrayList<>();
        int i = left, j = mid + 1;
        int count = 0;
        
        while(i <= mid && j <= right){
            
            if(arr[i] <= arr[j]) {
                
                temp.add(arr[i]);
                i++;
                
            } else {
                
                temp.add(arr[j]);
                count += (mid - i + 1);
                j++;
            }
        }
        
        while(i <= mid){
            temp.add(arr[i]);
            i++;
                
        }
        while(j <= right){
            temp.add(arr[j]);
            j++;
        }
        
        for(int k = 0; k < temp.size(); k++){
            arr[left + k] = temp.get(k);
        }
        
        return count;
    }
    
    static int mergeSort(int[] arr, int left, int right){
        
        if(left < right){
            
            int mid = left + (right - left) / 2;
            
            int leftInvCount  = mergeSort(arr, left, mid);
            int rightInvCount = mergeSort(arr, mid + 1, right);
            
            int invCount      = merge(arr, left, mid, right);
            
            return leftInvCount + rightInvCount + invCount;
        }
        
        return 0;
    }
    
    static int inversionCount(int arr[]) {
        // Code Here
        n = arr.length;
        
        return mergeSort(arr, 0 , n - 1);
    }
}