import java.util.Arrays;

public class ThreeSum {
    public static boolean hasThreeSum(int[] arr, int target) {
        // Step 1: Sort the array (Required for two-pointer approach)
        Arrays.sort(arr); // {0, 1, 2, 3, 3, 6, 8, 9}

        // Step 2: Fix the first element arr[i]
        for (int i = 0; i < arr.length - 2; i++) {
            int l = i + 1;                  // Left pointer starts right after i
            int r = arr.length - 1;         // Right pointer starts at the end

            // Step 3: Two-pointer search for the remaining sum
            while (l < r) {
                int currentSum = arr[i] + arr[l] + arr[r];

                if (currentSum == target) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[l] + ", " + arr[r]);
                    return true;
                } else if (currentSum < target) {
                    l++; // Need a larger sum -> move left pointer right
                } else {
                    r--; // Need a smaller sum -> move right pointer left
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3, 8, 0, 9};
        int k = 18;

        boolean found = hasThreeSum(arr, k);
        System.out.println("Target " + k + " exists: " + found);
    }
}


// import java.util.HashSet;

// public class ThreeSumHashSet {
//     public static boolean hasThreeSum(int[] arr, int target) {
//         for (int i = 0; i < arr.length - 2; i++) {
//             HashSet<Integer> set = new HashSet<>();
//             int currentTarget = target - arr[i];

//             for (int j = i + 1; j < arr.length; j++) {
//                 int required = currentTarget - arr[j];

//                 if (set.contains(required)) {
//                     System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + required);
//                     return true;
//                 }
//                 set.add(arr[j]);
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 3, 1, 6, 3, 8, 0, 9};
//         int k = 18;

//         System.out.println("Target " + k + " exists: " + hasThreeSum(arr, k));
//     }
// }