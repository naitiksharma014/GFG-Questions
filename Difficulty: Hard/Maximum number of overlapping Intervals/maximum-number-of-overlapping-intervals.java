
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
        Map<Integer, Integer> events = new TreeMap<>();
        
        for(int[] ar: arr){
            
            int start = ar[0];
            int end = ar[1];
            
            events.put(start, events.getOrDefault(start, 0) + 1);
            events.put(end + 1, events.getOrDefault(end + 1, 0) - 1);
        }
        
        int maxOverLap = 0;
        int overLap = 0;
        
        for(int event: events.values()){
            
            overLap += event;
            maxOverLap = Math.max(maxOverLap, overLap);
        }
        
        return maxOverLap;
    }
}
