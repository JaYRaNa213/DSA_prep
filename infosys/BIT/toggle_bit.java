public class toggle_bit {

  public static void main( String args[]){
    int n = 28;
    int i = 2;
    // 00011100
    // 00000100
    int ans =  (n ^ ( 1<< i));
    System.out.print(ans);

  
}
  }
