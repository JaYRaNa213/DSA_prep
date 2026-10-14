public class palindrome {


  public static boolean isPalindrome(String s){
    int start = 0;
    int end = s.length()-1;
    while ( start< end){
      if ( s.charAt(start)!= s.charAt(end)){
        return false;
      }
      end--;
      start++;
    }
    return true;
  }

  public static void main(String[] args) {
    String s= "abcbac";

    boolean ans = isPalindrome(s);
    System.out.print(ans);
  }
  
}
