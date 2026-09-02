

import java.util.*;
import java.util.Arrays;
public class string_insert{

  public static void insert_string(String str , char c){

    // fxcgz

    StringBuilder sb = new StringBuilder(str);
    sb.append(c);
    System.out.println(sb.toString());
    String s2 = sb.toString();
    char [] arr = s2.toCharArray();




   Arrays.sort(arr);

   for ( int i = 0 ; i < arr.length ; i++){

     System.out.print(arr[i]);

   }

  //  System.out.println("Sorted array is : " + Arrays.toString(arr));





  }


  public static void main ( String args[]){


    String str = "fxcgz";

    char c = 'k';

    insert_string(str,c);


  }
}