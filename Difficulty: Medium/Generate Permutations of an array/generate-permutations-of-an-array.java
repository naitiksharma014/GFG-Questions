class Solution {
    int n;
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    
    public void solve(ArrayList<Integer> temp, int[] nums){
        
        if(temp.size() == n){
            list.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = 0; i < n; i++){
           
           if(!set.contains(nums[i])){
               
               temp.add(nums[i]);
               set.add(nums[i]);
               
               solve(temp, nums);
               
               temp.remove(temp.size() - 1);
               set.remove(nums[i]);
           }
        }
    }
    public ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        n = arr.length;
        
        solve(new ArrayList<>(), arr);
        
        return list;
    }
};