class trionic_array{


  public static boolean isTrionic(int [] arr){

    int n = arr.length;
    //  { 1 , 3, 5, 4 , 2, 6};
    int i = 0;

    while (i+1 <n && arr[i]<arr[i+1] ){
      i++;
    }

    if (i == 0 &&  i == n-1){
      return false;
    }

    while ( i+1< n && arr[i]> arr[i+1] ){
      i++;
    }
    if ( i == n-1){
      return false;
    }

    while ( i+1<n && arr[i]<arr[i+1] ){
      i++;
    }

    if ( i==n-1){
      return true;
    }else {
      return false;
    }



  }
  public static void main ( String []args){
    int arr[] = { 1 ,3,5,4,3};

    boolean ans= isTrionic(arr);
    System.out.print(ans);
  }
}