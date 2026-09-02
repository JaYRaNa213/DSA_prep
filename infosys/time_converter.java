public class time_converter {

  public static void main(String [] args){
    String s="07:05:45PM";

    int n = s.length();

    String str = s.substring(0,8);
    // System.out.print(str);

    int hour = Integer.parseInt(str.substring(0,2));
   

    String remaining = s.substring(2, 8);

    String peroid = s.substring(8,10);

   
    if(peroid.charAt(0)=='A'){

    if(hour == 12){
      hour = 0;
    }
  }

    else {
      if(hour !=12){
        hour = hour + 12;
    }
    }

    
    String finalhour = String.format("%02d",hour) + remaining;

    System.out.print(finalhour);
    



  }
  
}
