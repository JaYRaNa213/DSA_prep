import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

    public static int longestSubstring(String s) {

int len ;
int maxlen = 0;
        

        for ( int i = 0 ; i< s.length() ; i ++){


            HashMap<Character, Integer> map = new HashMap <>();

            for ( int j = 0; j < s.length(); j ++){

                if ( !map.containsKey(s.charAt(i))){
                map.put( s.charAt(j), 1);
                len = map.size();
                }

               else { 

                break;
            }

            maxlen = Math.max( len, maxlen);
            }
        }


        return maxlen ;

    }

    public static void main(String[] args) {

        String s = "abcaabcdab";
        System.out.println(longestSubstring(s)); // Output: 3
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