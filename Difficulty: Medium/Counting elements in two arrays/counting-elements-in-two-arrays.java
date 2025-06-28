class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        int[] sorted_b = new int[100001];
        for( int i=0 ; i<b.length ; i++ ){
            sorted_b[ b[i] ]++;
        }
        for( int i=1 ; i<100001 ; i++ ) sorted_b[i] += sorted_b[i-1];
        
        ArrayList<Integer> ans = new ArrayList<>();
        for( int i=0 ; i<a.length ; i++ ){
            ans.add( sorted_b[a[i]] );
        }
        return ans;
    }
}