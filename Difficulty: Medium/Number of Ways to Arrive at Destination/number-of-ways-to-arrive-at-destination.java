class Solution {

    static class Pair {
        int node;
        long dist;

        Pair(int node, long dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    public int countPaths(int V, int[][] edges) {
        int MOD = 1000000007;

        @SuppressWarnings("unchecked")
        ArrayList<Pair>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            int u = e[0], v = e[1], wt = e[2];
            graph[u].add(new Pair(v, wt));
            graph[v].add(new Pair(u, wt));
        }

        // Step 2: Dijkstra setup
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(a.dist, b.dist)
        );

        long[] dist = new long[V];
        Arrays.fill(dist, Long.MAX_VALUE);

        int[] ways = new int[V];

        dist[0] = 0;
        ways[0] = 1;

        pq.offer(new Pair(0, 0));

        // Step 3: Dijkstra + counting
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            long d = curr.dist;

            if (d > dist[u]) continue;

            for (Pair nei : graph[u]) {
                int v = nei.node;
                long wt = nei.dist;

                // Found shorter path
                if (d + wt < dist[v]) {
                    dist[v] = d + wt;
                    ways[v] = ways[u];
                    pq.offer(new Pair(v, dist[v]));
                }
                // Found another shortest path
                else if (d + wt == dist[v]) {
                    ways[v] = (ways[v] + ways[u]) % MOD;
                }
            }
        }

        return ways[V - 1];
    }
}