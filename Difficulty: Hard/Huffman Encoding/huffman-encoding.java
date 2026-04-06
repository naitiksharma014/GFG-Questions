class Solution {

    static class Node {
        int data;
        int idx;
        Node left, right;

        Node(int data, int idx) {
            this.data = data;
            this.idx = idx;
            this.left = null;
            this.right = null;
        }
    }

    public ArrayList<String> huffmanCodes(String s, int f[]) {

        int n = f.length;

        // Min Heap with custom comparator
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> {
            if (a.data == b.data) {
                return a.idx - b.idx; // smaller index first
            }
            return a.data - b.data;
        });

        // Insert nodes
        for (int i = 0; i < n; i++) {
            pq.add(new Node(f[i], i));
        }

        // Build Huffman Tree
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            Node parent = new Node(left.data + right.data, Math.min(left.idx, right.idx));
            parent.left = left;
            parent.right = right;

            pq.add(parent);
        }

        Node root = pq.peek();

        ArrayList<String> ans = new ArrayList<>();
        solve(root, "", ans);

        return ans;
    }

    void solve(Node root, String s, ArrayList<String> ans) {
        if (root == null) return;

        // Leaf node
        if (root.left == null && root.right == null) {
            if (s.length() == 0) s = "0"; // edge case
            ans.add(s);
            return;
        }

        solve(root.left, s + "0", ans);
        solve(root.right, s + "1", ans);
    }
}