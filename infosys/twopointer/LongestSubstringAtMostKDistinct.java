// import java.util.HashMap;

// public class LongestSubstringAtMostKDistinct {

//     public static int longestSubstring(String s, int k) {

//         //  s = "baeaeba";
//         int len = 0;
//         int maxlen = 0 ;

//         for ( int i = 0 ; i < s.length(); i ++){

//             HashMap<Character , Integer> map = new HashMap<>();
//             for ( int j = i; j < s.length(); j ++){
//                 map.put( s.charAt(j), map.getOrDefault(s.charAt(j), 0) +1 );

//                  if ( map.size() == k){
//                 len = j-i+1;
//             }
                
//                 if ( map.size() > k){
//                 break;
//             }   
//             }
//             maxlen = Math.max( len , maxlen);
//         }

//         return maxlen ;
//     }

//     public static void main(String[] args) {

//         String s = "aaaaaa";
//         int k = 3;

//         System.out.println(longestSubstring(s, k));
//     }
// }


import java.util.HashMap;

public class LongestSubstringAtMostKDistinct {

    public static int longestSubstring(String s, int k) {

        int left = 0;
        int right = 0;
        int maxLen = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {

            map.put(s.charAt(right),
                    map.getOrDefault(s.charAt(right), 0) + 1);

            while (map.size() > k) {

                map.put(s.charAt(left),
                        map.get(s.charAt(left)) - 1);

                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {

        String s = "aeuuuuu";
        int k = 2;

        System.out.println(longestSubstring(s, k));
    }
}