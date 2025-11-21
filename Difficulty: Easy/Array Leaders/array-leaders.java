class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int maxElement = arr[n-1];
        list.add(maxElement);
        
        for(int i = n-2; i >= 0; i--){
            
            int val = arr[i];
            
            if(val >= maxElement){
                maxElement = val;
                list.add(maxElement);
            }
        }
        
        Collections.reverse(list);
        
        return list;
        
    }
}
