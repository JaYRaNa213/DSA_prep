package array;

// # Problem 3 (Arrays)

// Move all zeros to the end while maintaining the relative order of non-zero elements.
// Input

// [0,1,0,3,12]

// Output

// [1,3,12,0,0]

// Test Cases

// [0,0,1]
// → [1,0,0]

// [1,2,3]
// → [1,2,3]

// [0]
// → [0]
// package array;

// public class move_zeros_to_end {

//     public static void MoveZeros(int[] arr) {

//         int n = arr.length;
//         int[] arr2 = new int[n];

//         int index = 0;

      
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != 0) {
//                 arr2[index] = arr[i];
//                 index++;
//             }
//         }

//         // Fill remaining positions with 0
//         for (int i = index; i < n; i++) {
//             arr2[i] = 0;
//         }

//         // Print the final array
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr2[i] + " ");
//         }
//     }

//     public static void main(String[] args) {

//         int[] arr = {0, 1, 0, 3, 12};

//         MoveZeros(arr);
//     }
// }





public class move_zeros_to_end {


  public static void swap ( int [] arr, int a , int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

    public static void MoveZeros(int[] arr) {

        int n = arr.length;
        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, index, i);
                index++;
            }
        }

        // Print the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        MoveZeros(arr);
    }
}