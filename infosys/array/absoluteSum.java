package array;

public class absoluteSum {

  public static int maxAbsoluteSum(int[] nums) {

    int n = nums.length;

    // Maximum subarray sum
    int maxSum = nums[0];
    int currentMax = nums[0];

    for (int i = 1; i < n; i++) {
        currentMax = Math.max(nums[i], currentMax + nums[i]);
        maxSum = Math.max(maxSum, currentMax);
    }

    // Minimum subarray sum
    int minSum = nums[0];
    int currentMin = nums[0];

    for (int i = 1; i < n; i++) {
        currentMin = Math.min(nums[i], currentMin + nums[i]);
        minSum = Math.min(minSum, currentMin);
    }

    return Math.max(Math.abs(minSum), maxSum);
}


  public static void main(String[] args) {

        // Hardcoded array
        int[] nums = {1, -3, 2, 3, -4};

        // Call function
        int answer = maxAbsoluteSum(nums);

        // Print answer
        System.out.println("Maximum Absolute Sum = " + answer);
    }
  
}
