class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int n = arr.length;
        int police = 0, thief = 0;
        int count = 0;
        
        while(police < n && arr[police] == 'P') police++;
        while(thief < n && arr[thief] == 'T') thief++;
        
        while(police < n && thief < n){
            
            if(Math.abs(police - thief) <= k ){
                count++;
                police++;
                thief++;
            }
            
            else if(police < n && police < thief) police++;
            else if(thief < n && thief < police) thief++;
            
            while(police < n && arr[police] == 'P') police++;
            while(thief < n && arr[thief] == 'T') thief++;
        }
        
        return count;
    }
}