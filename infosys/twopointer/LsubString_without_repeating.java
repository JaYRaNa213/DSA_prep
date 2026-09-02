package twopointer;
import java.util.HashSet;

public class LsubString_without_repeating {

    public static void main(String[] args) {

        String s = "aaac";

        HashSet<Character> set = new HashSet<>();

        int maxlen = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {

            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));

            maxlen = Math.max(maxlen, r - l + 1);
        }

        System.out.println(maxlen);
    }
}




// import java.util.*;
// public class LsubString_without_repeating {

//   public static void main(String[] args) {

//     String s = "aaac";

//     HashSet<Character> set = new HashSet<>();  
    
//     int maxlen = 0;
//     int len = 0;
//     int r = 0;
//     int l = 0;


//     while ( r< s.length()){
//       if ( !set.contains(s.charAt(r))){
//         set.add(s.charAt(r));
//         len = r-l+1;
//         maxlen = Math.max(len , maxlen);
//         r++;

//       }
//       else {
//         len = 0;
//         l++;
//         set.clear();
//         r=l;
//       }
//     } 

//     System.out.print(maxlen);

//   }
  
// }


