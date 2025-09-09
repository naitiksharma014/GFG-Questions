class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        int n = mices.length;
        int max  = Integer.MIN_VALUE;
        
        Arrays.sort(mices);
        Arrays.sort(holes);
        
        for(int i = 0 ; i < n ; i++){
            max = Math.max( max , Math.abs(mices[i] - holes[i]) );
        }
        return max;
        
    }

}