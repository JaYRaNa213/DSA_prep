package twopointer;

public class K_zeros {


  public static void main ( String args[]){

    int arr []  = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 0};

    int k = 2;
    int l = 0; 
    int r = 0;

    int len = 0;
    int maxlen = 0;
    int zeros = 0;


    while( r < arr.length){

      if ( arr[ r] == 0 ){
        zeros++;
      }

      if ( zeros <= k){
        len = r-l+1;
        maxlen = Math.max(maxlen, len);

      }
      if ( zeros>k){
        
        if ( arr[l] == 0){
          zeros--;
        }
        l++;
      }
      r++;
    }

    System.out.println(maxlen);

  }

}
