public class find_bit {

  public static void main( String args[]){


    int n = 28 ;
    int i = 4;

    // 00011100
    // 100000
    // 3

    if ( (n & ( 1<< i))!= 0){

      System.out.print('1');

    }
    else{
      System.out.print('0');
    }




  }
  
}
