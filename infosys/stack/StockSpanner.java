package stack;

import java.util.*;

public class StockSpanner {

    Stack<int[]> st;
    // Constructor name must match the class name
    public StockSpanner() {
        st = new Stack<>();
    }
    public int next(int price) {
        int span = 1;
        while (!st.empty() && st.peek()[0] <= price) {
            span = span + st.peek()[1];
            st.pop();
        }
        
        st.push(new int[]{price, span});

        return span;
    }

    public static void main(String[] args) {
        int prices[] = {100, 80, 60, 70, 60, 75, 85};
        
        // Correct class instantiation
        StockSpanner spanner = new StockSpanner();

        for (int price : prices) {
            int span = spanner.next(price);
            System.out.print(span + " ");
        }
    }
}