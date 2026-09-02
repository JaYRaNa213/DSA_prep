package infosys.DP;

public class subSequenceSum2 {


  public static int maxSum(int arr[], int [] dp){

    int n = arr.length;

    if ( n== 0){
      return 0;

    }
    if ( n == 1){
      return arr[0];
    }

    

    return 0;
  }

   public static void main ( String args[]){

    int arr [] = { 4,2,5};
    int n = arr.length;
    int dp[] = new int [n+1];

    int ans = maxSum( arr, dp);
    System.out.println(ans);
  }


  
}
