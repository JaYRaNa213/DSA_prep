package twopointer;

import java.util.Arrays;

public class twoSum {

  public static void main(String[] args) {
    int arr[] = { 7,11,5,2,1};

    int target = 9;
    Arrays.sort(arr);
    // 1,2,5,7,11
    int l = 0 ; 
    int r = arr.length-1;

    while( l < r){
      if ( arr[l]  + arr[r] == target){
        System.out.println( arr[l] + " " + arr[r]);
      }
      if ( arr[l] + arr[r]< target){
        l++;
      }
      else{
        r--;
      }
    }

  }
  
}
