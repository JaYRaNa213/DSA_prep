public class exponention {

public static void main(String args[]){

  int base = 2;
  int exp = 10;

    long ans =1;

    while(exp>0){

        if((exp&1)==1)

            ans*=base;

        base*=base;

        exp>>=1;

    }

    System.out.print(ans);

}
}