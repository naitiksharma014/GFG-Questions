import java.util.*;

class Solution {

    static long MOD = 1000000007;

    // Fast power: x^y % MOD
    static long power(long x, long y) {
        long res = 1;
        x %= MOD;

        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % MOD;

            x = (x * x) % MOD;
            y >>= 1;
        }
        return res;
    }

    // nCr using factorial
    static long nCr(int n, int r, long[] fact, long[] invFact) {
        if (r > n) return 0;
        return (fact[n] * invFact[r] % MOD * invFact[n - r] % MOD) % MOD;
    }

    public ArrayList<Integer> countBSTs(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        // Step 1: Sort copy
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // Step 2: Map value → rank
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sorted[i], i);
        }

        // Step 3: Precompute factorials
        long[] fact = new long[2 * n + 1];
        long[] invFact = new long[2 * n + 1];

        fact[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        // Inverse factorial using Fermat
        invFact[2 * n] = power(fact[2 * n], MOD - 2);
        for (int i = 2 * n - 1; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }

        // Step 4: Compute result
        for (int i = 0; i < n; i++) {
            int L = map.get(arr[i]);
            int R = n - 1 - L;

            long catL = nCr(2 * L, L, fact, invFact) 
                        * power(L + 1, MOD - 2) % MOD;

            long catR = nCr(2 * R, R, fact, invFact) 
                        * power(R + 1, MOD - 2) % MOD;

            long ans = (catL * catR) % MOD;

            result.add((int) ans);
        }

        return result;
    }
}