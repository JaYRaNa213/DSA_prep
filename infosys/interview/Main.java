import java.util.*;

public class Main {

    public static int countWireParts(int n, String s, int[] w) {

        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        // Store frequency of each value on L and R side
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'L') {

                left.put(w[i], left.getOrDefault(w[i], 0) + 1);

            } else {

                right.put(w[i], right.getOrDefault(w[i], 0) + 1);
            }
        }

        int count = 0;

        // For every L value, find how many matching R values exist
        for (int value : left.keySet()) {

            int lCount = left.get(value);
            int rCount = right.getOrDefault(value,0);

            count =count+ Math.min(lCount, rCount);
        }

        return count;
    }

    public static void main(String[] args) {



        // Test Case 12
        int n12 = 14;
        String s12 = "LRLLRRLRRLLRLR";
        int[] w12 = {
                10, 20, 30, 10,
                30, 40, 20, 50,
                40, 60, 50, 70,
                60, 70
        };

        System.out.println("Test Case 12: " +
                countWireParts(n12, s12, w12));
    }
}