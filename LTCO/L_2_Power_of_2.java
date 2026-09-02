// public class L_2_Power_of_2 {
//   public static void main(String[] args) {
//     A obj =new A();
//     obj.isPowerOfTwo(16);
    
//   }
  
// }

// class A{
//   public boolean isPowerOfTwo(int n){
//     if(n<1){
//       return false;
//     }
//     else if(n==1){
//       while(n%2==0){
//         n=n/2;

//       }
//       if(n==1){
//         return true;
//       }
//       else{
//         return false;
//       }

//     }
//     return false;

//   }

// }


public class L_2_Power_of_2 {
  public static void main(String[] args) {
      A obj = new A();
      boolean result = obj.isPowerOfTwo(16); // Example input
      System.out.println(result); // Expected output: true
      
      result = obj.isPowerOfTwo(18); // Another example input
      System.out.println(result); // Expected output: false
  }
}

class A {
  public boolean isPowerOfTwo(int n) {
      if (n < 1) {
          return false;
      }
      while (n % 2 == 0) {
          n = n / 2;
      }
      return n == 1;
  }
}
