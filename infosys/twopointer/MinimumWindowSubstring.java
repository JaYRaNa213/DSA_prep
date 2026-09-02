public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        int[] arr = new int[256];

        for (char ch : t.toCharArray()) {
            arr[ch] = arr[ch] + 1;
        }

        int left = 0;
        int right = 0;

        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        while (right < s.length()) {

            if (arr[s.charAt(right)] > 0) {
                count++;
            }

            arr[s.charAt(right)]--;

            while (count == t.length()) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                arr[s.charAt(left)]++;

                if (arr[s.charAt(left)] > 0) {
                    count--;
                }

                left++;
            }

            right++;
        }

        if (startIndex == -1) {
        return "";
        }

        return s.substring(startIndex, startIndex + minLen);
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));
    }
}







// public static String minWindowBrute(String s, String t) {

//     int n = s.length();
//     int m = t.length();

//     int minLen = Integer.MAX_VALUE;
//     int sIndex = -1;

//     for (int i = 0; i < n; i++) {

//         int[] hash = new int[256];
//         int count = 0;

//         for (int j = 0; j < m; j++) {
//             hash[t.charAt(j)]++;
//         }

//         for (int j = i; j < n; j++) {

//             if (hash[s.charAt(j)] > 0) {
//                 count++;
//             }

//             hash[s.charAt(j)]--;

//             if (count == m) {

//                 if (j - i + 1 < minLen) {
//                     minLen = j - i + 1;
//                     sIndex = i;
//                 }

//                 break;
//             }
//         }
//     }

//     return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLen);
// }