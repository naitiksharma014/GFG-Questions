class Solution {
    public boolean canEat(int[] piles, int mid, int h){
        int totalHours = 0;
        
        for(int pile: piles){
            
            totalHours += pile / mid;
            
            if(pile % mid != 0){
                totalHours++;
            }
        }
        
         return (totalHours <= h);
    }
    
    public int kokoEat(int[] piles, int h) {
        // code here
        int n = piles.length;
        int l = 1, r = 0;
        
        // Find max element 
        for(int pile: piles){
            r = Math.max(r, pile);
        }
        
        while(l < r){
            
            int mid = l + (r - l) / 2;
            
            if(canEat(piles, mid, h)){
                r = mid;
            } else{
                l = mid + 1;
            }
        }
        
        return l;
    }
}
