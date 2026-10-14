
import java.util.*;
class WingSpan_Binary_String{

  public static int maxBalancedSubstrings(String s){

    // s = 0101

    HashMap<Character,Integer>  map = new HashMap <>();

    int count =0;

    for ( int i = 0 ; i < s.length(); i++){
      // map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
      if ( s.startsWith("1") && s.endsWith("0" )|| s.startsWith("0") && s.endsWith("1")){

        count ++;

      }
    }




  }


  public static void main ( String args[]){
    String s= "1001101";

    int ans = maxBalancedSubstrings(s);



  }

}



































































