// class a{
  
//   boolean isPalindrome(int x){
  
//     if(x<0){
//       return false;
//     }
//     int n=x;
//     int revNum=0;

//     while(n>0){
//       int d;
//       d=n%10;
//       revNum =revNum *10 + d;
//       n=n/10;

//     }
//     if (revNum==x){
//       return true;

//     }
//     else{
//       return false;

//     }
//   }
// }

// public class D_1_palindrome {
//   public static void main(String[] args) {

//     a x=new a();
//     x.isPalindrome(243);
//     x.isPalindrome(-121);
//     x.isPalindrome(343);
//     x.isPalindrome(141);
//   }}





class A {
  boolean isPalindrome(int x) {
      if (x < 0) {
          return false;
      }
      int n = x;
      int revNum = 0;

      while (n > 0) {
          int d = n % 10;
          revNum = revNum * 10 + d;
          n = n / 10;
      }
      return revNum == x;
  }
}

public class D_1_palindrome {
  public static void main(String[] args) {
      A x = new A();
      System.out.println("Is 243 a palindrome? " + x.isPalindrome(243));   // Expected output: false
      System.out.println("Is -121 a palindrome? " + x.isPalindrome(-121)); // Expected output: false
      System.out.println("Is 343 a palindrome? " + x.isPalindrome(343));   // Expected output: true
      System.out.println("Is 141 a palindrome? " + x.isPalindrome(141));   // Expected output: true
  }
}
