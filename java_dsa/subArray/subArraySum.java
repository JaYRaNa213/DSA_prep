import java.util.*;
public class subArraySum{
  public static void main(String[]args){

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the length of array: ");
    // int n = sc.nextInt();

    // int [] arr= new int [n];
    // int []arr = {2,5,3,1,4,6,9,0 };
    // [ 2, 1, 3,5, 7,2]
    // Arrays.sort(arr);
    // for (int i =0 ; i < arr.length; i ++)
    // {
    //   System.out.print(arr[i] + " ");
    // }
    //  System.out.print(" Subarray count is :");
    //  int count = 0;
    // int k = 5;
    // for (int i = 0 ; i < arr.length; i++){
    //   int sum = 0;
    //   for(int j = i ; j < arr.length; j++){
    //     sum = sum + arr[j];

    //     if(sum== k){
    //       count ++;
    //     }
    //   }
    // }
    // System.err.println(count) ;
    // Optimal 
    // int []arr = {3,2,5,3,1,4,6,9,0 };
    int []arr = {1,2,3};
    int l = 0 ;
    int r = 0;
    int sum =0;
    int k = 3;
    int count=0;
    while(r< arr.length){
      sum = sum + arr[r];
      while(sum> k ){
        sum = sum - arr[l];
        l++;
      }
      if(sum == k){
        count ++;
      }
      r++;
    }
    System.out.print(count);
  }
}