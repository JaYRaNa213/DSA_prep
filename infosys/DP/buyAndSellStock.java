public class buyAndSellStock {

  public static void main(String[] args) {
    int arr[] = {7,3,4,1,2,3};
    int n = arr.length;

    int min = arr[0];

    int profit = 0;

    for (int i = 1 ; i < n ; i++){
      // {7, 3 , 4 , 1 , 2 , 3 }
      int diff = arr[i] - min;
      profit = Math.max(profit,diff);
      min = Math.min(min,arr[i]);
    }
    System.out.print( profit);

  }
}
