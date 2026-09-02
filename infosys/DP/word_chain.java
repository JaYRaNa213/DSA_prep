package infosys.DP;
 import java.util.Arrays;
import java.util.Scanner;
public class word_chain {

    // Check whether wordA is a predecessor of wordB
    public static boolean isPredecessor(String wordA, String wordB) {

        // wordB must have exactly one extra character
        if (wordA.length() + 1 != wordB.length()) {
            return false;
        }

        int i = 0;
        int j = 0;

        boolean skipped = false;

        while (i < wordA.length() && j < wordB.length()) {

            if (wordA.charAt(i) == wordB.charAt(j)) {

                i++;
                j++;

            } else {

                // We can skip only ONE character from wordB
                if (skipped) {
                    return false;
                }

                skipped = true;
                j++;
            }
        }

        return true;
    }


    public static int findLongestChain(String[] words) {

        int n = words.length;

        // Sort words according to their length
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));

        // DP array
        int[] dp = new int[n];

        Arrays.fill(dp, 1);

        int maxL = 1;


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (isPredecessor(words[j], words[i])) {

                    dp[i] = Math.max(dp[i], dp[j] + 1);

                    maxL = Math.max(maxL, dp[i]);
                }
            }
        }

        return maxL;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of words
        int n = sc.nextInt();
        String[] words = new String[n];
        // Input words
            // a
            // b
            // ba
            // bca
            // bda
            // bdca
            
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Find longest chain
        int answer = findLongestChain(words);

        // Print answer
        System.out.println(answer);

        sc.close();
    }
}
