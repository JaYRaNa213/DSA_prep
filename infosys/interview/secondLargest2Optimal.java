import java.util.*;

public class secondLargest2Optimal {

    public static int secondL(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1; // Edge case: Array must have at least 2 elements

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;   // Old max becomes secondMax
                max = arr[i];      // Update max to the new larger element
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i]; // Update secondMax if element is between max and secondMax
            }
        }
        
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 7, 22, 25, 25, 19 };
        int n = secondL(arr);
        System.out.println("Second largest element is: " + n); // Outputs: 22
    }
}