class Solution {
    public String findLargest(int[] arr) {
        
        int n = arr.length;
        
        // Step 1: convert int[] to String[]
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(arr[i]);
        }
       
       
        // Step 2: sort using lambda comparator
        Arrays.sort(str, 
            (s1, s2) -> (s2 + s1).compareTo(s1 + s2)
        );
        
        
        // Step 3: edge case (all zeros)
        if (str[0].equals("0")) return "0";
        
        
        // Step 4: build result
        StringBuilder st = new StringBuilder();
        
        for(String s: str){
            st.append(s);
        }
        
        return st.toString();
    }
}