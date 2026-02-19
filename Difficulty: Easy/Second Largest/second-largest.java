class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = -1;
        
        for(int a: arr){
            
            if(firstMax < a) {
                secondMax = firstMax;
                firstMax = a;
                
            } else if(a < firstMax && a > secondMax){
                secondMax = a;
            }
            
            
        }
        
        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }
}