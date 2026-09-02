
import java.util.*;
public class reverse_string {

  public static void main (String[] args){
    // StringBuilder sb = new StringBuilder("hello");
    // for(int i = 0; i < sb.length()/2 ; i ++){
    //   int front = i;
    //   int last = sb.length() -1 -i;
    //   char  firstchar = sb.charAt(front);
    //   char lastchar = sb.charAt(last);
    //   sb.setCharAt(last,firstchar);
    //   sb.setCharAt(front, lastchar);
    // }
    // System.out.println(sb);
    // // sb.reverse();
    // // System.out.println("Reversed String: " + sb);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String :");
    String s = sc.nextLine();

    char [] arr = s.toCharArray();
    for(int i = 0 ; i < s.length(); i++){
      System.out.print(" " + arr[i]);
    }
    int start = 0;
    int end = arr.length-1;
    while(start < end){
      swap(start , end , arr);
      start++;
      end--;
    }
    // System.out.print(arr.getClass());

    for (int i = 0 ; i < arr.length; i++){
      System.out.print(" " + arr[i]);
    }
  }
  public static void swap(int start , int end, char arr[]){
    char temp = arr[start];
    arr[start] = arr[end];
    arr[end]= temp;
  }

  
}
