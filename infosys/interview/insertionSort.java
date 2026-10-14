public class insertionSort {

  public static void insertionSortImpl(int arr[]){

    int n = arr.length ;
     for ( int i = 0 ; i < n ; i ++){
      for ( int j = i+1 ; j < n ; j ++){

        if ( arr[i]>arr[j]){

          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;

        }

      }
     }

     for ( int i = 0 ; i < n ; i++){
      System.out.print(arr[i]+" ");
     }



  }

  public static void main ( String []args){
    int arr[] = { 2,1,7,3,9,0};

    insertionSortImpl(arr);
  }
  
}