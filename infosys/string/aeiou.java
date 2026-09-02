// public class aeiou {
//     public static void main(String[] args) {
//         String s = "aaeeiiaoouu";
//         String order = "aeiou";

//         int last = 0;
//         int count = 0;

//         for (char ch : s.toCharArray()) {
//             int curr = order.indexOf(ch);

//             if (curr >= last) {
//                 count++;
//                 last = curr;
//             }
//         }

//         System.out.println(count);
//     }
// }




// public class aeiou {
//     public static void main(String[] args) {

//         String s = "iaaeeiiaoouu";

//         char last = 'a';
//         int count = 0;

//         for (char ch : s.toCharArray()) {

//             if (ch >= last) {
//                 count++;
//                 last = ch;
//             }
//         }

//         System.out.println(count);
//     }
// }


import java.util.*;

public class aeiou {

    public static void main(String[] args) {

        String s = "aaeeiiaoouu";

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 1);
        map.put('i', 2);
        map.put('o', 3);
        map.put('u', 4);

        int last = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (map.get(ch) >= last) {
                count++;
                last = map.get(ch);
            }
        }

        System.out.println(count);
    }
}