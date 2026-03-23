class Solution {
    public int longestCycle(int V, int[][] edges) {

       
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]); // u -> v
        }

        boolean[] vis = new boolean[V];
        boolean[] pathVis = new boolean[V];
        int[] time = new int[V];

        int maxLen = -1;
        int timer = 1;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                maxLen = Math.max(maxLen,
                        dfs(i, graph, vis, pathVis, time, timer));
            }
        }

        return maxLen;
    }

    public int dfs(int node, ArrayList<Integer>[] graph,
                   boolean[] vis, boolean[] pathVis,
                   int[] time, int timer) {

        vis[node] = true;
        pathVis[node] = true;
        time[node] = timer++;

        int maxLen = -1;

        for (int nei : graph[node]) {

            if (!vis[nei]) {
                maxLen = Math.max(maxLen,
                        dfs(nei, graph, vis, pathVis, time, timer));
            }

            else if (pathVis[nei]) {
                // cycle found
                int cycleLen = time[node] - time[nei] + 1;
                maxLen = Math.max(maxLen, cycleLen);
            }
        }

        pathVis[node] = false;
        return maxLen;
    }
}