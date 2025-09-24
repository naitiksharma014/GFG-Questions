class Solution {
    public static String toBinary(int n) {
        if (n == 1) return "1";

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);   // store remainder
            n /= 2;
        }

        return sb.reverse().toString();  
    }
    
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            
            String binary = toBinary(i);
            
            list.add(binary);
        }
        
        return list;
    }
}
