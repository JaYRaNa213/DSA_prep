import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

    public static int longestSubstring(String s) {

    int len ;
    int maxlen = 0;

    int l = 0;
    int r = 0;

    HashMap < Character , Integer> map = new HashMap<>();


    while ( r< s.length()){
        while ( map.containsKey(s.charAt(r))){
            map.remove(s.charAt(l));
            l++;

        }

        map.put(s.charAt(r),1);
        maxlen = Math.max(maxlen , r-l+1);
        r++;

    }
        return maxlen ;

    }

    public static void main(String[] args) {

        String s = "abcaabcdefab";
        System.out.println(longestSubstring(s));
    }
}


// import java.util.Arrays;

// public class LongestSubstringWithoutRepeating {

//     public static int longestSubstring(String s) {

//         //

//         int [] arr = new int[256];
//         Arrays.fill( arr, -1);

//         int l = 0;
//         int r = 0;
//         int len = 0;
//         int maxlen = 0;

//         // [ -1 ,-1 ,-1 , -1 , -1 ]
//         //  abcabcbb 
//         while( r < s.length()){
//             if ( arr[s.charAt(r)] != -1 && arr[s.charAt(r)] >= l){

//                 l =  arr[s.charAt(r)] + 1;
//             }

//             arr[s.charAt(r)] = r;
           
//             len = r-l+1;
//             maxlen = Math.max( len, maxlen);
//              r++;

//         }
//         return maxlen;

        
//     }

//     public static void main(String[] args) {

//         String s = "aaaabcdabcbb";
//         System.out.println(longestSubstring(s)); // Output: 3
//     }
// }