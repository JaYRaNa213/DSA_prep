package stack;
import java.util.*;

public class removeDuplicate {
    public static String removeDuplicateString(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            
            if (!st.empty() && st.peek() == s.charAt(i)) {
                st.pop(); // remove duplicate pair
            } else {
                st.push(s.charAt(i)); // add character
            }
        }
        
        // Build result from stack
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        String str = removeDuplicateString(s);
        System.out.println(str); // Output: "ca"
    }
}
