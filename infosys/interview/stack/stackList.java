package infosys.interview.stack;

import java.util.*;

public class stackList {
  List<Integer> list = new ArrayList<>();


  public void push(int x){
    list.add(x);
  }

  public int pop(){
   return list.remove(list.indexOf(list.getLast()));

  }
  public int top(){
    return list.getLast();
  }
  public boolean empty(){
    return list.isEmpty();
  }
  public static void main(String[] args) {
    stackList stack = new stackList();


    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println(stack.top());

    System.out.println(stack.pop());
    System.out.println(stack.pop());

    System.out.println(stack.top());
    System.out.println(stack.pop());
    System.out.println(stack.empty());
      }
}

