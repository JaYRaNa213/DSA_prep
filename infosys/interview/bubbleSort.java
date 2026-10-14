class bubbleSort{

  public static void bubbleSortImpl(int arr[]){
    int n = arr.length;

    for ( int i = 0 ; i < n-1 ; i ++){
      for ( int j = 0; j < n-i-1 ; j++){

        // { 5,1,5,2,9};
        if ( arr[j]> arr[j+1]){
          swap(arr, j,j+1);

        }
      }
    }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

  }

  public static void swap(int arr[], int a , int b){
    int temp = arr[a];
    arr[a]= arr[b];
    arr[b]= temp;
  }






  public static void main ( String args[]){
    int arr[]= { 5,2,1,9,5};

    bubbleSortImpl(arr);

  }
}