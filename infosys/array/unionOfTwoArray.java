import java.util.Arrays;

public class unionOfTwoArray {

  public static void main(String[] args) {
    int arr1[] = { 2,1,5,4,2,7,11,15,18,9,19};
    int arr2[] = { 3, 5, 1,8, 10};
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    // arr1 = 1,2,2,4,5,7
    // arr2 = 1,2,3,5,8,10
    int count = 0 ;
    Integer lastVisited  = null;
    int i = 0;
    int j = 0 ;

    while ( i <arr1.length && j < arr2.length ){

      int current ;

      if ( arr1[i] < arr2[j]){
        current = arr1[i];
        i++;
      }
      else if ( arr1[i] > arr2[j]){
        current = arr2[j];
        j++;

      }else{
        current = arr1[i];
        i++;
        j++;

      }

      if ( lastVisited == null || current != lastVisited){
        System.out.print(current+" ");
        lastVisited = current;
        count++;
      }
    }

    while ( i < arr1.length){
      System.out.print(arr1[i]+ " ");
      i++;
      count ++;
    }
    while ( j < arr2.length){
      System.out.print( arr2[j]  + " ");
      j ++;
      count++;

    }


    System.out.println(" Count of all elements of array :");
    System.out.println(count);
    

    
  }
  
}
