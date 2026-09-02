public class stringBuilder {

  public static void main ( String[] args){
    String s = "Jay rana";

    //  System.out.print(s);


    StringBuilder sb = new StringBuilder(s);

    sb.append('f');
    sb.append('f');
    
    String s2 = sb.toString();

    // System.out.println(s2);
    StringBuilder sb2 = new StringBuilder(s2);


    sb.reverse();
    String s3 = sb.toString();
    // System.out.println(s3);

    sb.deleteCharAt(2);


   char c = '3';
   char z='0';
  //  int i = c-'0';
   System.out.print(c);
   System.out.print(z);
   System.out.print(c-z);


  }
  
}
