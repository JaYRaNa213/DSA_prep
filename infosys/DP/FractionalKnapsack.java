import java.util.Arrays;

public class FractionalKnapsack {

    public static double fractionalKnapsack(int[] val, int[] wt, double capacity) {

        int n = val.length;

        double items [][] = new double [n][3];

        for ( int i = 0 ; i < n ; i ++){
            items[i][0] = val[i];
            items[i][1] = wt[i];
            items[i][2] = (double) val[i]/ wt[i];
        }
        // {60  10 6 }
        // {100 20 5 }
        // {120 30 4};

        Arrays.sort(items, (a,b)-> Double.compare(b[2], a[2]));
        // {60  10 6 }
        // {100 20 5 }
        // {120 30 4};

        double result = 0;
        // capacity = 50 
        for ( int i = 0 ; i  < n ; i ++){

            if ( items[i][1] <= capacity){
                result = result + items[i][0];
                capacity = capacity- items[i][1];
            }else{
                result = result + capacity * items[i][2]; 
                break;
            }
        }

        return result;


    }
    public static void main(String[] args) {

        int[] val = { 60 , 100 , 120 };

        int[] wt = { 10, 20, 30 };

        double capacity = 50;

        double answer = fractionalKnapsack( val, wt , capacity ) ;

        System.out.println(" Maximum Profit =  " + answer ) ;

    }
}
