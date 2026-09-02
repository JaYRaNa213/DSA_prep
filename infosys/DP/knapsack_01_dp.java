public class knapsack_01_dp {

    public static int knapsack(int W, int[] val, int[] wt) {

        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < W + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int take = 0;
                int skip = 0;
                if (wt[i - 1] <= j) {
                    take = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                }
                skip = dp[i - 1][j];
                dp[i][j] = Math.max(take, skip);
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int W = 7;
        int[] val = {10, 40, 30, 50};
        int[] wt = {3, 2, 4, 5};
        int answer = knapsack(W, val, wt);
        System.out.println("Maximum Value = " + answer);
    }
}