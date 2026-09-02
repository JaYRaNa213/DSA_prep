package twopointer;

import java.util.Arrays;

public class removeDuplicate {

    public static void main(String[] args) {

        int[] arr = {4,1,2, 1, 2, 2, 3,5};

        Arrays.sort(arr);

        int l = 0;
        int r = 1;

        while (r < arr.length) {

            if (arr[l] != arr[r]) {
              l++;
                
                arr[l] = arr[r];
               
            }

            r++;
        }

        for (int i = 0; i <= l; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
