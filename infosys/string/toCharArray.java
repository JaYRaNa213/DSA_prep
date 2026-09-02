public class toCharArray {

  public static void main ( String args []){
    String s = "jay rana";

   char a =  Character.toUpperCase(s.charAt(1));
    System.out.println(a);

    String sUpper = s.toUpperCase();
    System.out.println(sUpper);
  
  
  char arr[] = s.toCharArray();


  for ( int i = 0 ; i < arr.length; i ++){
    // System.out.println(arr[i]);
  }


  arr[4] ='T';
  arr[5] ='h';
  arr[6] ='a';
  arr[7] ='k';

  String s2 = new String(arr);
  // System.out.print(s2);


  char v = 'a';

  boolean ap = Character.isUpperCase(v);
  // System.out.print(ap);

  String str = "hello";
  String str2 = "Hello";

  boolean w= str.equals(str2);
  boolean w2= str.equalsIgnoreCase(str2);
  System.out.println(w);
  System.out.println(w2);




}
  
}
