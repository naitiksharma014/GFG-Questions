// ⏱ Time Complexity: O(V + E)
// 📦 Space Complexity: O(V + E)

class Solution {
    static class Edge {
        int src, dest;
        
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public ArrayList<Integer> minHeightRoot(int V, int[][] edges) {
        // Code here
        if (V == 1) {
            ArrayList<Integer> res = new ArrayList<>();
            res.add(0);
            return res;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int[] indegree = new int[V];
        
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        
        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            
            indegree[u]++;
            indegree[v]++;
            
            graph[u].add(new Edge(u, v));
            graph[v].add(new Edge(v, u));
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++) {
            if(indegree[i] == 1) {  // adding all leaf nodes so that we can remove them later
                q.add(i);   
            }
        }
        
        while(V > 2) {
            int size = q.size();
            V -= size;  // removing nodes with indegree 1
            
            while(size--> 0) {
                
                int curr = q.poll();
                
                for(Edge e: graph[curr]) {
                    
                    int nei = e.dest;
                    indegree[nei]--;
                    
                    if(indegree[nei] == 1) {
                        q.add(nei);
                    }
                }
            }
        }
        
         while (!q.isEmpty()) {
            result.add(q.poll());
        }
        
        return result;
    }
}