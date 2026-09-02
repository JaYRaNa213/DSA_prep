package infosys.DP;
import java.util.*;

public class longestIncreasingSubsequence {

  public static int solve( int [] arr){
    int n = arr.length;
    int []dp = new int [n];
    Arrays.fill(dp,1);

    int maxLen = 0;

    for ( int i = 1 ; i < n ; i ++){
      for ( int j = 0; j < i ; j ++){

        if ( arr[ j] < arr[i]){
          dp [ i] = Math.max( dp[i], dp[j] +1);

          maxLen = Math.max( dp[i],maxLen);
          
        }

      }
    }
    return maxLen;
  }

  public static void main ( String [] args){
    int[] arr = { 2 ,1,8,3,2,7,9,16,10,20};

    int ans = solve ( arr);

    System.out.print(ans);
  }
}
