class Solution {
    
    static int timer;
    
    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int[] e : edges) {
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visited = new boolean[V];
        int[] tin = new int[V];
        int[] low = new int[V];
        boolean[] isAP = new boolean[V];
        
        timer = 0;
        
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                dfs(i, -1, adj, visited, tin, low, isAP);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            if(isAP[i]) res.add(i);
        }
        
        if(res.size() == 0) {
            res.add(-1);
        }
        
        return res;
    }
    
    static void dfs(int u, int parent,
                    ArrayList<ArrayList<Integer>> adj,
                    boolean[] visited,
                    int[] tin,
                    int[] low,
                    boolean[] isAP) 
    {
        
        visited[u] = true;
        tin[u] = low[u] = timer++;
        
        int children = 0;
        
        for(int v : adj.get(u)) {
            
            if(v == parent) continue;
            
            if(!visited[v]) {
                dfs(v, u, adj, visited, tin, low, isAP);
                
                low[u] = Math.min(low[u], low[v]);
                
                // articulation condition
                if(parent != -1 && low[v] >= tin[u]) {
                    isAP[u] = true;
                }
                
                children++;
            } else {
                // back edge
                low[u] = Math.min(low[u], tin[v]);
            }
        }
        
        if(parent == -1 && children > 1) {
            isAP[u] = true;
        }
    }
}