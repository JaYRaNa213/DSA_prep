
package greedy;
public class lemonade_change {
  public static boolean lemonadeCharge(int bills []){
    // { 5, 5, 5, 10, 20 }
    int n = bills.length;

    int five = 0;
    int ten = 0;

    for ( int  i = 0 ;  i < n ; i ++){

      if ( bills[i] == 5 ){
        five ++;
      }else if( bills[i] == 10){
        if ( five == 0){
          return false;
        }

        five--;
        // 10 
        ten++;
      }else if ( bills[i] == 20){
        if ( five > 0 && ten > 0){
          ten--;
          five--;
        }else if( five>=3){
          five = five -3;
        }
        else{
          return false;
        }
      }
    }


    return true;
  }
  public static void main ( String [] args){
    int [ ] bills  = { 5,5,5,10,20};
    System.out.println(lemonadeCharge(bills));
  }
}
