
class subSetSum{


  public static boolean solve ( int [] nums){

     int n = nums.length;
    int tSum = 0;
    for ( int i = 0; i < n ; i ++){
      tSum = tSum + nums[i];
    }
    if ( tSum%2 != 0){
        return false;
    }
    int target = tSum /2;
    boolean []dp = new boolean [target+1];

    dp[0]  = true;
    
    for  ( int num : nums){

      for ( int j = target; j >=num ; j--){
        // { 1,5,11,5};
        dp[j] = dp[j] || dp[j-num];
      }
    }
    return dp[target]; 

  }
  public static void main ( String args[]){

    int arr[] = {6,1,8,9};
    boolean ans = solve(arr);

    System.out.print(ans);



  }
}