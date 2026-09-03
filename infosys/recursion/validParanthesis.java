package recursion;

import java.util.*;

public class validParanthesis {

  ArrayList<String> result = new ArrayList<>();

  void parenthesis( String paren , int open , int close , int n){

    if ( paren.length() == 2*n){
      result.add(paren);
      return;
    }


    if ( open < n ){
      parenthesis(paren + "(", open + 1, close, n);
    }
    if ( close < n){
      parenthesis(paren + ")" , open , close+1,n);
    }

  }

    public static void main(String[] args) {

        int n = 3;

        validParanthesis vP = new validParanthesis();

        vP.parenthesis("", 0, 0, n);

        // Print output
        for (String s : vP.result) {
            System.out.println(s);
        }
    }
}
