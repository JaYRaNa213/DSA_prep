public class reverse {


  public static void main (String [] args){

    System.out.print(" Simple Array : ");

    int [] arr = { 1,2,3,4,5,6};

    for( int i : arr){
      System.out.print(i + " ");
    }

    System.out.println();

    reverse(arr);

    System.out.print(" Reversed array : ");

    for( int i : arr){
      System.out.print(i + " ");
    }


  }

  public static void reverse(int [] arr){

    int start= 0;
    int end = arr.length-1;

    while(start < end ){


      swap(arr,start,end);

      start ++;
      end --;

    }


  }

  public static void  swap ( int [] arr , int start , int end){

    int temp = arr[ start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
}