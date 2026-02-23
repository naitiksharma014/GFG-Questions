class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        int n = a.length;
        int m = b.length;
        
        Set<Integer> set = new HashSet<>();
        
        for(int num: a){
            set.add(num);
        }
        
        for(int num: b){
            set.add(num);
        }
        
        return new ArrayList<>(set);
    }
}