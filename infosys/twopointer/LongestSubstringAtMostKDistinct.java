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

        int l = 0;
        int r = 0;
        int maxLen = 0;

        HashMap < Character, Integer> map = new HashMap<>();

        char arr[] = s.toCharArray();


        while (r< s.length()){
            map.put(arr[r], map.getOrDefault(arr[r], 0)+ 1);

            while(map.size()> k){
                map.put(arr[l], map.get(arr[l])-1);
                if ( map.get(arr[l] )== 0){
                    map.remove(arr[l]);
                }
                l++;
            }
            maxLen = Math.max(r-l+1, maxLen);

            r++;
        }
        return maxLen;

        
    }

    public static void main(String[] args) {

        String s = "aeuuuuu";
        int k = 2;

        System.out.println(longestSubstring(s, k));
    }
}