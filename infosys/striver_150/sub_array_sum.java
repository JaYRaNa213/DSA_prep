import java.util.*;

class Solution {
    // Function to find maximum sum of subarrays
    public int maxSubArray(int[] nums) {
        
       // better :
        
        // int maxi = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0; 
        //     for (int j = i; j < nums.length; j++) {
        //         sum += nums[j];
        //         maxi = Math.max(maxi, sum);
        //     }
        // }
        // return maxi;

        // Optimal

        int n = nums.length;
        int sum = 0 ;

        int maxi = Integer.MIN_VALUE;

        for ( int i = 0 ; i < n ; i ++){
            sum = sum + nums[i];
            if ( sum > maxi ){
                maxi = sum;
            }
            if ( sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}

// Separate Main class in the same file
public class sub_array_sum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, 5, 4,-3 };

        // Create an instance of Solution class
        Solution sol = new Solution();

        int maxSum = sol.maxSubArray(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
