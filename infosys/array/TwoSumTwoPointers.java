

import java.util.Arrays;

public class TwoSumTwoPointers {
    public static boolean twoSum(int[] arr, int target) {
        // Step 1: Sort the array (Required for two pointers)
        Arrays.sort(arr); // {1, 2, 4, 7, 8}

        int l = 0;
        int r = arr.length - 1;

        // Step 2: Move pointers inward
        while (l < r) {
            int currentSum = arr[l] + arr[r];

            if (currentSum == target) {
                System.out.println("Pair found: " + arr[l] + " + " + arr[r] + " = " + target);
                return true;
            } else if (currentSum < target) {
                l++; // Sum is too small -> move left pointer right
            } else {
                r--; // Sum is too large -> move right pointer left
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 8};
        int target = 12;

        boolean ans = twoSum(arr, target);
        System.out.println("Target exists: " + ans);
    }
}



// import java.util.HashSet;

// public class TwoSum {
//     public static boolean twoSum(int[] arr, int target) {
//         HashSet<Integer> set = new HashSet<>();

//         for (int num : arr) {
//             int complement = target - num;

//             // If we've already seen the number needed to reach target
//             if (set.contains(complement)) {
//                 System.out.println("Pair found: " + complement + " + " + num + " = " + target);
//                 return true;
//             }

//             set.add(num);
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 4, 1, 7, 8};
//         int target = 12; // 4 + 8 = 12

//         boolean ans = twoSum(arr, target);
//         System.out.println("Target exists: " + ans);
//     }
// }

