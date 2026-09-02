package twopointer;
import java.util.HashSet;

public class SubString {

    public static void main(String[] args) {

        String s = "abcabcbb";

        char arr[]  = s.toCharArray();

        // [ a, b, c, a, b, c, b, b ]

        int l = 0;
        int r = 0;

        while (r<arr.length){

            

        }







    //     int maxCount = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         HashSet<Character> set = new HashSet<>();   
    //         int count = 0;
    //         // "abcabcbb";
    //         for (int j = i; j < s.length(); j++) {
    //             if (set.contains(s.charAt(j))) {
    
    //                 break;
    //             }
    //             set.add(s.charAt(j));
    //             count++;
    //         }
    //         maxCount = Math.max(maxCount, count);
    //     }
    //     System.out.println(maxCount);

    }
}