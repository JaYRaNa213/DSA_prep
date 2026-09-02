import java.util.Arrays;

public class buyAndSell2 {

    public static int buyAndSell(int prices[], int days, int buy, int[][] dp) {

        // Base case
        if (days == prices.length) {
            return 0;
        }

        
        if (dp[days][buy] != -1) {
            return dp[days][buy];
        }

        int profit;

        if (buy == 1) {

            // Buy today
            int take = -prices[days]
                    + buyAndSell(prices, days + 1, 0, dp);

            // Don't buy today
            int notTake = buyAndSell(prices, days + 1, 1, dp);

            profit = Math.max(take, notTake);

        } else {

            // Sell today
            int take = prices[days]
                    + buyAndSell(prices, days + 1, 1, dp);

            // Don't sell today
            int notTake = buyAndSell(prices, days + 1, 0, dp);

            profit = Math.max(take, notTake);
        }

        return dp[days][buy] = profit;
    }

    public static void main(String[] args) {

        int prices[] = {2, 3, 4, 1, 4, 8};

        int[][] dp = new int[prices.length][2];

        
        for (int i = 0; i < dp.length; i++) {
    Arrays.fill(dp[i], -1);
}


        int ans = buyAndSell(prices, 0, 1, dp);

        System.out.println(ans);
    }
}