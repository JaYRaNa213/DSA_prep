class binarySearch{
  public static void main ( String [] args){
    int [] arr = {1, 2, 3, 7,8,20,25};
    int target = 20 ;

    int start = 0 ;
    int end = arr.length-1;
    int mid = 0;
    while (start<= end){

      if ( arr[mid ] == target){
        System.out.print(mid);
        break;
      }
      
      mid = start +( end-start)/2;
      if ( arr[mid] < target){
        start = mid + 1;
      }
      else if ( arr[mid] > target ){
        end = mid-1;
      }
    }
  }
}