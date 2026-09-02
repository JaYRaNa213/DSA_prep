import java.util.*;

class Solution {
    // Function to return the LIS as a list
    public List<Integer> longestIncreasingSubsequence(int[] nums) {
        int n = nums.length;

        // DP array to store length of LIS ending at each index
        int[] dp = new int[n];

        // Array to store previous index of LIS element for reconstruction
        int[] prev = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        // Compute LIS length for each index
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {
                    // Update dp[i] and store previous index
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
        }

        // Find the index of maximum LIS length
        int maxLen = 0, maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIndex = i;
            }
        }

        // Reconstruct LIS sequence
        List<Integer> lisSeq = new ArrayList<>();
        int curr = maxIndex;
        while (curr != -1) {
            lisSeq.add(nums[curr]);
            curr = prev[curr];
        }

        // Reverse sequence as it was built backwards
        Collections.reverse(lisSeq);

        return lisSeq;
    }
}

public class LIS {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

        Solution sol = new Solution();
        List<Integer> lis = sol.longestIncreasingSubsequence(nums);

        System.out.print("LIS: ");
        for (int x : lis) System.out.print(x + " ");
        System.out.println();
    }
}










// import java.util.*;

// class Solution {
//     /* Function to find the longest increasing 
//     subsequence in the given array */
//     public int LIS(int[] nums) {
//         int n = nums.length;
        
//         List<Integer> temp = new ArrayList<>();
//         temp.add(nums[0]);
        
//         // Iterate on the elements of the array
//         for (int i = 1; i < n; i++) {
            
//             // If the current element can be added to the subsequence
//             if (nums[i] > temp.get(temp.size() - 1)) 
//                 temp.add(nums[i]); 
                
//             // Otherwise
//             else {
//                 // Index at which the current element must be placed
//                 int ind = Collections.binarySearch(temp, nums[i]);
//                 if (ind < 0) ind = -(ind + 1);
                
//                 // Place the current element in the subsequence
//                 temp.set(ind, nums[i]);
//             }    
//         }
        
//         // Return the length of temporary subsequence created so far
//         return temp.size();
//     }
// }

// class LIS {
//     public static void main(String[] args) {
//         int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        
//         // Creating an object of Solution class
//         Solution sol = new Solution();
//         int lengthOfLIS = sol.LIS(nums);
        
//         System.out.println("The length of the LIS for the given array is: " + lengthOfLIS);
//     }
// }




// import java.util.*;

// public class LIS {

//     public static int lis(int[] nums) {

//         ArrayList<Integer> tails = new ArrayList<>();

//         for (int num : nums) {

//             int left = 0;
//             int right = tails.size();

//             while (left < right) {
//                 int mid = left + (right - left) / 2;

//                 if (tails.get(mid) < num) {
//                     left = mid + 1;
//                 } else {
//                     right = mid;
//                 }
//             }

//             if (left == tails.size()) {
//                 tails.add(num);
//             } else {
//                 tails.set(left, num);
//             }
//         }

//         return tails.size();
//     }

//     public static void main(String[] args) {

//         int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};

//         System.out.println(lis(arr));
//     }
// }