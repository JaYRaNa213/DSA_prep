package infosys.DP;

import java.util.*;
public class pairsChain {

  public static int findLongestChain( int [][] nums,int dp[]){

    // n = 3

    // [1, 2]  [3, 4] [2,3]

    // Arrays.sort(nums);

    int n  = nums.length;

    Arrays.sort(nums,(a,b)-> Integer.compare(a[0],b[0]));

    int maxlen = 1;

    for ( int i = 0  ; i < n ; i ++){
      for ( int j = 0 ; j<i ; j++){

        if ( nums[j][1] < nums[i][0]){
          dp [i] = Math.max(dp[i], dp[j] +1);
          maxlen = Math.max(maxlen, dp[i]);

        }
      }
    }
    return maxlen;

  }

  public static void main ( String args[]){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int nums[][] = new int[n][2];

    for ( int i = 0; i < n ; i ++){
      nums[i][0]= sc.nextInt();
      nums[i][1] = sc.nextInt();
    }


    int dp [] = new int[n];
    Arrays.fill(dp,1);

    int answer = findLongestChain(nums,dp);

    System.out.print(answer);

    
  }
  
}
