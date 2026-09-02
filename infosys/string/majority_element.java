// Problem 7 (HashMap)
// Find the majority element.
// An element appears more than **n/2** times.
// Input
// [2,2,1,1,2,2]
// Output
// 2

import java.util.*;
public class majority_element{
  public static void main ( String args[]){

    HashMap < Integer,Integer> map = new HashMap<>();
    int arr []  = {1,1,1,1,1,1,3,2 ,2, 1,1,2};
    int n = arr.length;

    int k = n/2;

    for ( int i = 0 ; i < n ;i ++){
      map.put ( arr[i], map.getOrDefault(arr[i], 0 )  + 1);
    }

    for ( int key : map.keySet()){

      if ( map.get(key ) > k){

        
        System.out.print(key) ;

      }
    }
  }
}
