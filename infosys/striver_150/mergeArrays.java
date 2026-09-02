package striver_150;

class mergeArrays{

    public static void merge_two_arrays(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {

            // If arr1[i] is greater than
            // smallest element of arr2
            if (arr1[i] > arr2[0]) {

                // Swap
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // Put arr2[0] in correct position
                int first = arr2[0];
                int j = 1;

                while (j < arr2.length && arr2[j] < first) {
                    arr2[j - 1] = arr2[j];
                    j++;
                }

                arr2[j - 1] = first;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 7, 8, 10, 12};
        int[] arr2 = {2, 3, 9, 11, 15};

        merge_two_arrays(arr1, arr2);

        for (int x : arr1) {
            System.out.print(x + " ");
        }

        System.out.println();

        for (int x : arr2) {
            System.out.print(x + " ");
        }
    }
}