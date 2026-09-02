
package array;

// Find the missing number.

// Numbers are from
// Exactly one number is missing.
// Example
// Input
// [3,0,1]

// Output

// 2



public class find_missing_number {

  public static int missingNumber( int [] nums){

    // {3,0,2,1,4,5,6,8};
    int sum = 0;
    int n = nums.length;
    for ( int i = 0 ; i < n ; i ++){
      sum = sum + nums[i];
    }

    int orgSum = n*(n+1)/2;

    return orgSum - sum;

    

  }

  public static void main ( String args[]){
    int[] nums = {3,0,2,1,4,5,6,8};
    System.out.println(missingNumber(nums));
  }



  
}
