
import java.util.*;
class StackQueue {

  Queue<Integer> queue = new LinkedList<>();

  public void push ( int x){
    queue.add(x);

    int size = queue.size();

    for ( int i = 0 ; i < size-1; i++){
      int front= queue.remove();
      queue.add(front);
    }
  }
  // 20 10 30 - > size = 3  ;
  // 10 30 20 
  // 30 20 10

    public int pop(){
      if (queue.isEmpty()){
        throw new RuntimeException(" Stack is empty");
      }
      // return queue.remove();
      return queue.poll();
    }

    public int top(){
      if(queue.isEmpty()){
        throw new RuntimeException(" Stack is empty");

      }
      return queue.peek();
    }

    public boolean empty(){
      return queue.isEmpty();
    }

  public static void main (String[]args){

    StackQueue stack  = new StackQueue();
    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println(stack.top());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

    System.out.println(stack.empty());


  }
}
