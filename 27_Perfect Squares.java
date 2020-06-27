class Solution {
    public int numSquares(int n) {
        int[] t = new int[n + 1];
        Arrays.fill(t, n);
        t[0] = 0;
        t[1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (i - j * j >= 0)
                    t[i] = Math.min(t[i - j * j] + 1, t[i]);
            }
        }

        return t[n];
    }
}
