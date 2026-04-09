class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        int n = a.length;
        int m = b.length;
        Set<Integer> set = new HashSet<>();
        
        for(int num: a) {
            set.add(num);
        }
        
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int num : b) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num); // avoid duplicates
            }
        }
        
        return result;
    }
}