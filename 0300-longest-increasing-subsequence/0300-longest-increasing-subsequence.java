class Solution {
    public int f(int ind, int prev, int[] arr, int n, int[][] dp) {
        if (ind == n) return 0;

        if (dp[ind][prev + 1] != -1) return dp[ind][prev + 1];
        int len = f(ind + 1, prev, arr, n, dp);
        if (prev == -1 || arr[ind] > arr[prev]) {
            len = Math.max(len, 1 + f(ind + 1, ind, arr, n, dp));
        }

        return dp[ind][prev + 1] = len;
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return f(0, -1, nums, n, dp);
    }
}
