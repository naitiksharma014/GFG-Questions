// TC: O(V + E)

class Solution {
    
   static class Edge {
        int src, dest;
                
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    
    public boolean DFS(int curr, int parent, ArrayList<Edge>[] graph, boolean[] vis){
        vis[curr] = true;
        
        for(Edge e: graph[curr]) {
            
            int nei = e.dest;
            
            if(!vis[nei]) {
                if(DFS(nei, curr, graph, vis)) return true;
            }
            else if(nei != parent) {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }
        
        // Build Graph
        for(int[] edge: edges){
            
            int u = edge[0]; // u - v
            int v = edge[1]; // v - u
            
            graph[u].add(new Edge(u, v));
            graph[v].add(new Edge(v, u));
        }
        
        boolean[] vis = new boolean[V];
        
        for(int i = 0; i < V; i++) {
            
            if(!vis[i]){
                if(DFS(i, -1, graph, vis)) return true; // curr, parent, graph, vis
            }
        }
        
        return false;
    }
}