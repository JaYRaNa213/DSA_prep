public class ParaReverse {

  public static void main(String[] args) {
    String s = "Hey My Name Is Jay Rana";

    System.out.println(s);

    System.out.print(" array of words ");

    String []  words= s.split(" ");
    
    for ( String word : words){
      // System.out.println(word+" ");
    }

  
    String arr [] = new String[words.length];

    int j = 0;

    for ( int i = words.length-1; i >=0; i --){
     

      arr[j] = words[i];
      j ++;
    }

    System.out.println("index");

    // System.out.println(arr[0]);

    for ( String word : arr){
      // System.out.print(word+ " ");
    }

    System.out.println("\n"); 



    String str = String.join("k", arr);
    System.out.println(str); 



  }
  
}
