class Solution {
    public int[] stableMarriage(int[][] men, int[][] women) {
        int n = men.length;

        int[] manPartner = new int[n];     // result: man -> woman
        int[] womanPartner = new int[n];  // woman -> man
        int[] next = new int[n];          // next woman to propose

       
        for (int i = 0; i < n; i++) {
            manPartner[i] = -1;
            womanPartner[i] = -1;
        }

       
        int[][] rank = new int[n][n];
        for (int w = 0; w < n; w++) {
            for (int i = 0; i < n; i++) {
                rank[w][women[w][i]] = i;
            }
        }

        
        java.util.Queue<Integer> q = new java.util.LinkedList<>();
        for (int i = 0; i < n; i++) q.add(i);

        while (!q.isEmpty()) {
            int man = q.poll();

            int woman = men[man][next[man]];
            next[man]++;

            if (womanPartner[woman] == -1) {
                
                womanPartner[woman] = man;
                manPartner[man] = woman;
            } else {
                int curr = womanPartner[woman];

                
                if (rank[woman][man] < rank[woman][curr]) {
                    womanPartner[woman] = man;
                    manPartner[man] = woman;

                    manPartner[curr] = -1;
                    q.add(curr); // previous man becomes free
                } else {
                    q.add(man); // rejected, try next woman later
                }
            }
        }

        return manPartner;
    }
}