class Solution {
    static int[] nextPalindrome(int[] num) {
        int n = num.length;

        // check if all digits are 9
        boolean all9 = true;
        for (int x : num) {
            if (x != 9) {
                all9 = false;
                break;
            }
        }

        // If all 9 → 100...001
        if (all9) {
            int[] res = new int[n + 1];
            res[0] = 1;
            res[n] = 1;
            return res;
        }

        int[] pal = num.clone();

        // mirror left → right
        for (int i = 0; i < n / 2; i++) {
            pal[n - i - 1] = pal[i];
        }

        // Step 3: check if palindrome > original
        boolean greater = false;
        for (int i = 0; i < n; i++) {
            if (pal[i] > num[i]) {
                greater = true;
                break;
            } else if (pal[i] < num[i]) {
                break;
            }
        }

        if (greater) return pal;

        // Step 4: increment middle
        int carry = 1;
        int mid = n / 2;

        if (n % 2 == 1) {
            pal[mid] += carry;
            carry = pal[mid] / 10;
            pal[mid] %= 10;
            mid--;
        } else {
            mid--;
        }

        // propagate carry to left side
        while (mid >= 0 && carry > 0) {
            pal[mid] += carry;
            carry = pal[mid] / 10;
            pal[mid] %= 10;
            mid--;
        }

        // Step 5: mirror again
        for (int i = 0; i < n / 2; i++) {
            pal[n - i - 1] = pal[i];
        }

        return pal;
    }
}