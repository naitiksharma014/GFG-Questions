class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        int n = start.length;
        Map<Integer, Integer> events = new TreeMap<>();
        
        for(int i = 0; i < n; i++){
            
            events.put(start[i], events.getOrDefault(start[i], 0) + 1);
            events.put(end[i]  , events.getOrDefault(end[i]  , 0) - 1);
        }
        
        int overLap = 0;
        int max_overLap = 0;
        
        for(int event: events.values()){
            
            overLap += event;
            
            max_overLap = Math.max(overLap, max_overLap);
        }
        
        return max_overLap;
    }
}
