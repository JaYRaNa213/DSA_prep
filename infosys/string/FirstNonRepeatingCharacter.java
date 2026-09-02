// # Problem 10 (HashMap + Strings)

// Given a string, return the first non-repeating character.

// Input

// "leetcode"

// Output

// 'l'

// Input

// "aabb"

// Output

// '#'

// public class FirstNonRepeatingCharacter {

//     public static char firstNonRepeating(String s) {

//         for (int i = 0; i < s.length(); i++) {

//             boolean unique = true;

//             for (int j = 0; j < s.length(); j++) {

//                 if (i != j && s.charAt(i) == s.charAt(j)) {
//                     unique = false;
//                     break;
//                 }
//             }

//             if (unique) {
//                 return s.charAt(i);
//             }
//         }

//         return '#';
//     }

//     public static void main(String[] args) {

//         System.out.println(firstNonRepeating("leetcode"));   // l
//         System.out.println(firstNonRepeating("aabb"));       // #
//         System.out.println(firstNonRepeating("lleetcode"));  // t
//         System.out.println(firstNonRepeating("aaleetcode")); // l
//     }
// }


import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeating(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '#';
    }

    public static void main(String[] args) {

        System.out.println(firstNonRepeating("leetcode"));
        System.out.println(firstNonRepeating("aabb"));
        System.out.println(firstNonRepeating("lleetcode"));
        System.out.println(firstNonRepeating("aaleetcode"));
    }
}