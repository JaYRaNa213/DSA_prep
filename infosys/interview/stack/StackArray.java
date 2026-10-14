package infosys.interview.stack;

public class StackArray {

    int[] arr;
    int top=-1;

    // Constructor
    public StackArray(int size) {
        arr = new int[size];
    }

    // Push
    public void push(int x) {

        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = x;
    }

    // Pop
    public int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = arr[top];
        top--;

        return value;
    }

    // Top / Peek
    public int top() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    // Is Empty
    public boolean empty() {
        return top == -1;
    }

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element:");
        System.out.println(stack.top());

        System.out.println("Popped element:");
        System.out.println(stack.pop());

        System.out.println("Popped element:");
        System.out.println(stack.pop());

        System.out.println("Top element:");
        System.out.println(stack.top());

        System.out.println("Empty or non-empty:");
        System.out.println(stack.empty());
    }
}