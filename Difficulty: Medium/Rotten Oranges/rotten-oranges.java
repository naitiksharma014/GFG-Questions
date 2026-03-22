class Solution {
    public int orangesRot(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // Step 1: Push all rotten + count fresh
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 2){
                    q.offer(new int[]{i, j});
                } else if(mat[i][j] == 1){
                    fresh++;
                }
            }
        }

        // If no fresh oranges
        if(fresh == 0) return 0;

        int time = 0;
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        // Step 2: BFS
        while(!q.isEmpty()){
            int size = q.size();
            boolean rotted = false;

            for(int i = 0; i < size; i++){
                int[] curr = q.poll();

                for(int[] d : dir){
                    int ni = curr[0] + d[0];
                    int nj = curr[1] + d[1];

                    if(ni >= 0 && nj >= 0 && ni < m && nj < n && mat[ni][nj] == 1){
                        mat[ni][nj] = 2;
                        q.offer(new int[]{ni, nj});
                        fresh--;
                        rotted = true;
                    }
                }
            }

            if(rotted) time++;
        }

        // Step 3: Check
        return fresh == 0 ? time : -1;
    }
}