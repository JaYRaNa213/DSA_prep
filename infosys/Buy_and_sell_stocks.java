
import java.util.Arrays;

public class Buy_and_sell_stocks {

    public long getMaximumProfit(long[] arr, int n) {

        // Edge case
        if (n == 0) {
            return 0;
        }

        // dp[ind][buy]
        // buy = 0 -> can buy
        // buy = 1 -> can sell
        long[][] dp = new long[n + 1][2];

        // Base case
        dp[n][0] = 0;
        dp[n][1] = 0;

        // Traverse from back
        for (int ind = n - 1; ind >= 0; ind--) {

            for (int buy = 0; buy <= 1; buy++) {

                long profit = 0;

                // =========================
                // BUY STATE
                // =========================
                if (buy == 0) {

                    // OPTION 1 -> SKIP BUYING
                    long skipBuy = dp[ind + 1][0];

                    // OPTION 2 -> BUY STOCK
                    long buyStock = -arr[ind] + dp[ind + 1][1];

                    // Take maximum profit
                    profit = Math.max(skipBuy, buyStock);
                }

                // =========================
                // SELL STATE
                // =========================
                else {

                    // OPTION 1 -> SKIP SELLING
                    long skipSell = dp[ind + 1][1];

                    // OPTION 2 -> SELL STOCK
                    long sellStock = arr[ind] + dp[ind + 1][0];

                    // Take maximum profit
                    profit = Math.max(skipSell, sellStock);
                }

                // Store answer
                dp[ind][buy] = profit;
            }
        }

        // Start from day 0 with buy allowed
        return dp[0][0];
    }

    public static void main(String[] args) {

        Buy_and_sell_stocks sp = new Buy_and_sell_stocks();


        long[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(
            "Maximum Profit = " +
            sp.getMaximumProfit(prices, prices.length)
        );
    }
}

