package array;

import java.util.*;

public class isValidParanthisis {

    public static boolean isValidParenthesis(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
                continue;
            }

            // Closing parenthesis
            if (ch == ')') {
                if (st.isEmpty() || st.peek() != '(') {
                    return false;
                }
                st.pop();
            }

            // Closing square bracket
            else if (ch == ']') {
                if (st.isEmpty() || st.peek() != '[') {
                    return false;
                }
                st.pop();
            }

            // Closing curly bracket
            else if (ch == '}') {
                if (st.isEmpty() || st.peek() != '{') {
                    return false;
                }
                st.pop();
            }
        }

        return st.isEmpty();
    }


    public static void main(String[] args) {

        String s = "()[]{}[]";

        boolean ans = isValidParenthesis(s);

        System.out.println(ans);
    }
}