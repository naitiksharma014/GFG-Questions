// DFS
// TC: O(V + E)
// SC: O(V + E)
class Solution {
    static class Edge {
        int src, dest;
        
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    
    public boolean DFS(int curr, ArrayList<Edge> graph[], int[] vis) {
        vis[curr] = 1;
        
        for(Edge e: graph[curr]) {
            int nei = e.dest;
            
            if(vis[nei] == 0) {
                if(DFS(nei, graph, vis)) {
                    return true;
                }
            }
            else if(vis[nei] == 1) {
                return true;   // cycle found
            }
        }
        
        vis[curr] = 2;
        return false;
    }
    public boolean canFinish(int n, int[][] prerequisites) {
        // code here
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[n];
        
        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        
        for(int[] p: prerequisites) {
            int u = p[0];
            int v = p[1];
            
            //graph[u].add(new Edge(u, v));
            graph[v].add(new Edge(v, u));
        }
        
        int[] vis = new int[n];
        
        for(int i = 0; i < n; i++) {
            
            if(vis[i] == 0) {
                
                if(DFS(i, graph, vis)) {
                    return false;  // cycle → cannot finish
                }
            }
        }
        
        return true;
    }
}