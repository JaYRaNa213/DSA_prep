
import java.util.*;
class secondLargest{


  public static int secondL(int []arr){


    int n = arr.length;

    Arrays.sort(arr);
    // 1 2 7 19 22 25 25

    // return arr[n-2]; it fails for duplicate values

    int largest = arr[n-1];

    for ( int i = n-2; i >=0 ; i --){
      if ( arr[i]!= largest){
        return arr[i];
      }
    }
    return -1;

  }


  public static void main ( String [] args){

    int arr [] = { 2,1,7,22,25,25,19};
    int n = secondL(arr);
    System.out.println("Second largest element is: " + n);

  }
}