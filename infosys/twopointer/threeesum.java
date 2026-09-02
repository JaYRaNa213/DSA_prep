import java.util.*;

public class threeesum {
  public static void main(String[] args) {
    int [ ]arr = {4,3,5,3,7,1};
    int target = 7;
    Arrays.sort(arr);
    // 1,2,3,3,4,5,7

    HashSet< List<Integer>> result = new HashSet<>();

    

    for ( int i = 0 ; i < arr.length-2; i ++){
      int l = i+1;
      int r = arr.length-1;

      while ( l < r){
        int sum = arr[i] + arr[l]+ arr[r];

        if ( sum == target){
          System.out.print(arr[i]+" "+ arr[l]+" "+ arr[r]);
          l++;
          r--;
        }


        if ( sum > target){

          r--;

        }else{
          l++;

        }

      }

    }


  }
  
  
}
