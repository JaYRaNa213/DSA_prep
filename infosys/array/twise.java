package array;
import java.util.*;
public class twise{

  public static void main( String args[]){


    int arr [ ] =  {4,2,3,0,3,2,8,4,9,7};

  //  HashMap<Integer, Integer> map = new HashMap<>();

  //  for ( int i = 0 ; i < arr.length; i ++){

  //   if ( map.containsKey(arr[i])){
  //     System.out.print(arr[i]);
  //     return ;
  //   }

  //   map.put(arr[i], 1 );
  //  }


  //  System.out.println(-1);

    for (int i = 1; i < arr.length; i++) {

    for (int j = 0; j < i; j++) {

        if (arr[i] == arr[j]) {
            System.out.println(arr[i]);
            return;
        }
    }


}


  }}


  


  

