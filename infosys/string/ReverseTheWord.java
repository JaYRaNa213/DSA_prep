
// # Problem 8 (Strings)

// Reverse the words in a sentence.

// Input

// "I love Java"

// Output

// "Java love I"
// Test Cases

// "Hello"
// Output
// "Hello"
// "   the sky   is blue   "
// Output
// "blue is sky the"
import java.util.ArrayList;
import java.util.List;

public class ReverseTheWord {

    public static List<String> reversedString(String s) {

        char[] arr = s.toCharArray();

        List<String> list = new ArrayList<>();

        int r = arr.length - 1;

        while (r >= 0) {

            // Skip spaces
            while (r >= 0 && arr[r] == ' ') {
                r--;
            }

            String ans = "";

            // Read one word
            while (r >= 0 && arr[r] != ' ') {
                ans = arr[r] + ans;
                r--;
            }

            if (!ans.equals("")) {
                list.add(ans);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        String s = "I love Java";

        List<String> result = reversedString(s);

        System.out.println(result);
    }
}