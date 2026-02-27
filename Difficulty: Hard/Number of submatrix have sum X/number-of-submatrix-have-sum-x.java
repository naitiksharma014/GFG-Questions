class Solution {
    public int countSquare(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] ps = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                ps[i][j] = mat[i - 1][j - 1]
                        + ps[i - 1][j]
                        + ps[i][j - 1]
                        - ps[i - 1][j - 1];
            }
        }

        int count = 0;
        int maxSize = Math.min(n, m);

        for (int size = 1; size <= maxSize; size++) {
            for (int i = size; i <= n; i++) {
                for (int j = size; j <= m; j++) {

                    int sum = ps[i][j]
                            - ps[i - size][j]
                            - ps[i][j - size]
                            + ps[i - size][j - size];

                    if (sum == x) count++;
                }
            }
        }

        return count;
    }
}