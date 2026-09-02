
import java.util.*;

public class   Reverse_the_sentense{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence to reverse: ");
        String str1 = sc.nextLine();

        String temp = "";
        String ans = "";

        int i = str1.length() - 1;

        while (i >= 0) {

            // skip spaces
            while (i >= 0 && str1.charAt(i) == ' ') {
                i--;
            }

            temp = "";

            // collect word
            while (i >= 0 && str1.charAt(i) != ' ') {
                temp = str1.charAt(i) + temp;
                i--;
            }

            // add to answer
            if (!temp.equals("")) {
                if (!ans.equals("")) {
                    ans = ans + " " + temp;
                } else {
                    ans = temp;
                }
            }
        }

        System.out.println(ans);
    }
}

// public class Reverse_the_sentense {

//     public static String reverse_str(String str) {
//         int left = 0;
//         int right = str.length() - 1;
//         String temp = "";
//         String ans = "";
//         while (left <= right) {
//             char ch = str.charAt(left);
//             if (ch != ' ') {
//                 temp = temp + ch;
//             } else {
//                 if (!temp.equals("")) {
//                     if (!ans.equals("")) {
//                         ans = temp + " " + ans;
//                     } else {
//                         ans = temp;
//                     }
//                     temp = "";
//                 }
//             }
//             left++; 
//         }
//         // handle the last word
//         if (!temp.equals("")) {
//             if (!ans.equals("")) {
//                 ans = temp + " " + ans;
//             } else {
//                 ans = temp;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         String str = "My name is jay rana";
//         System.out.println(reverse_str(str));
//     }
// }

