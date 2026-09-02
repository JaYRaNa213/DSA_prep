// public class D_3_fibonacii {
//   public static void main(String[] args) {
//     A obj=new A();
//     obj.fib(10);
    
//   }
// }


// class A{
//    public int fib(int n){
//     if(n==0){
//       return 0;
      
//     }
//     else if(n==1){
//       return 1;

//     }
//     else{
//       return fib(n-1)+fib(n-2);
//     }
// }
// }



public class D_3_fibonacii {
  public static void main(String[] args) {
      A obj = new A();
      int result = obj.fib(10); // Example input
      System.out.println("Fibonacci number for 10 is: " + result);
  }
}

class A {
  // Recursive approach
  public int fib(int n) {
      if (n == 0) {
          return 0;
      } else if (n == 1) {
          return 1;
      } else {
          return fib(n - 1) + fib(n - 2);
      }
  }
  
  // Iterative approach for better performance
  public int fibIterative(int n) {
      if (n == 0) {
          return 0;
      } else if (n == 1) {
          return 1;
      }
      
      int a = 0;
      int b = 1;
      int c = 0;
      
      for (int i = 2; i <= n; i++) {
          c = a + b;
          a = b;
          b = c;
      }
      
      return c;
  }
}
