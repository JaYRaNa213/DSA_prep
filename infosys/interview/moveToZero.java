


public class MoveToZero{

  public static void moveAllZeros(int arr[]){
    int n = arr.length;

    // 2, 4, 8, 0, 1, 0, 0, 5, 1, 40
    int j = 0;

    //  2, 8, 0, 0, 0,0,0, 1, 4 ,0
    for ( int i = 0 ; i <n;i++ ){
      if ( arr[i]!= 0){
        arr[j] = arr[i];
        j++;
      }
    }

    System.out.println("ans array :" );

    for ( int i = j+1 ; i < n ; i++){
      arr[i] = 0;
    }

    for ( int i = 0 ; i < n ; i++){
      System.out.print(arr[i]+" ");
    }
  }



    public static void main(String[] args) {
        int arr[] = { 2, 8, 0, 0, 0,0,0, 1, 4 ,0};
        moveAllZeros(arr);
    }
}