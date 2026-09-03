import java.util.*;

public class knapsack_01_dp {

    public static int knapsack(int i, int W, int[] val, int[] wt, int[][] dp) {

        if (i >= wt.length || W == 0) {
            return 0;
        }

        if (dp[i][W] != -1) {
            return dp[i][W];
        }

        int take = 0;

        if (wt[i] <= W) {
            take = val[i] + knapsack(i + 1, W - wt[i], val, wt, dp);
        }

        int notTake = knapsack(i + 1, W, val, wt, dp);

        return dp[i][W] = Math.max(take, notTake);
    }

    public static void main(String[] args) {

        int W = 7;

        int[] val = {10, 40, 30, 50};
        int[] wt = {3, 2, 4, 5};

        int m = val.length;

        // W + 1 because we need columns 0 through W
        int[][] dp = new int[m][W + 1];

        // Initialize every cell to -1
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = knapsack(0, W, val, wt, dp);

        System.out.println("Maximum Value = " + ans);
    }
}
