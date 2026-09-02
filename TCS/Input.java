
import java.util.Scanner;
import java.util.ArrayList;

public class Input{




  public static void main(String[] args) {


    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<String> list1 = new ArrayList<String>();

    Scanner sc = new Scanner(System.in);

    for(int i =0 ; i < 5 ; i ++){
      System.out.println("enter your  " + i + " element " );
      // list.add(sc.nextInt());
      list1.add(sc.nextLine());
    }

    System.out.println(" All elements are here : ");

    // for (int i = 0 ; i < 5; i ++){

    //   System.out.println(list.get(i));
    // }

    // for (int i = 0 ; i < 5; i ++){

    //   System.out.println(list1.get(i));
    // }


    for (String str : list1 ){
      System.out.println(str);
    }
    // System.out.println(list.indexOf(50));
    // System.out.println(list.indexOf(10));
    // System.out.println(list.indexOf(20));

    System.out.println(" hii ");

    
    
  }
}