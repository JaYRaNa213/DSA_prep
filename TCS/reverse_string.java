import java.util.*;
public class reverse_string{

  public static boolean ispal(String str){

    

		// str = "palindrome - [j,  a ,b ,a ,j]
		char arr [] = str.toCharArray(); 
		
		int s= 0;
		int e = arr.length-1;
		while(s<e){
			if(arr[s]!=arr[e]){
				return false;
			}
			else{
				s++;
				e--;
			}
			
		 }
		return true;

	}

  

	public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

    if(!ispal(str)){
      System.out.println("false");
    }
    else{
System.out.println("true");
    }

		
	
  }
}