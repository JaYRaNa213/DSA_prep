import java.util.Arrays;

class sortColors {
  
  public static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}


    public static String sortColors(int[] arr) {


      

      // {0, 2, 1, 1, 0, 2, 2, 1, 0, 1, 2, 0, 1};

      // Method 1 

      // Arrays.sort(arr);


      // Method 2

      // int zeros= 0;
      // int ones= 0;
      // int twos= 0;

      // for ( int i = 0 ; i < arr.length; i ++){
      //   if ( arr[i] == 0){
      //     zeros++;
      //   }
      //   if( arr[i] == 1){
      //     ones++;
      //   }
      //   if ( arr[i] == 2){
      //     twos++;
      //   }
      // }

      //   for ( int i = 0; i < zeros ; i ++){
      //     arr[i] = 0;
      //   }
      //   for ( int i = zeros; i < ones+zeros ; i ++){
      //     arr[i] = 1;
      //   }
      //   for ( int i = ones+zeros; i <ones+zeros+ twos ; i ++){
      //     arr[i] = 2;
      //   }

      // Method 3

     // {0, 2, 1, 1, 0, 2, 2, 1, 0, 1, 2, 0, 1};

     int low = 0;
     int mid = 0;
     int high =arr.length-1;


     while(mid<= high){
      if ( arr[mid] == 0){
        swap(arr,low,mid);
        low ++;
        mid++;
      }
      else if ( arr[mid]== 1){
        mid++;
      } else{
        swap(arr,mid , high);
        high--;
      }
     }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {

        int arr[] = {0, 2, 1, 1, 0, 2, 2, 1, 0, 1, 2, 0, 1};

        String s = sortColors(arr);

        System.out.println(s.getClass().getSimpleName());



        System.out.println(s);
    }
}
