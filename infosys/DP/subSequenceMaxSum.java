
package infosys.DP;

public class subSequenceMaxSum {

    public static long maxSum(int n , int[] nums,long dp[][]) {

      for ( int i = 1; i < n +1; i ++){

        
        dp[i][0] = Math.max(dp[i-1][1] - nums[i-1], dp[i-1][0]);

        dp[i][1] = Math.max(dp[i-1][0] + nums[i-1],dp[i-1][1]);
      }

      return Math.max(dp[n][0],dp[n][1]);
    }

    public static void main(String[] args) {

        int[] nums = {6, 2, 1, 2, 4, 5};
        int n = nums.length;
        long dp[][] = new long [n+1][2];

        long ans = maxSum(n, nums,dp);

        System.out.println(ans);
    }
}
