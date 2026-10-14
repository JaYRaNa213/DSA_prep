public class mergeSort {

    // Main function that sorts arr[l..r] using merge()
    public static void mergeSortImpl(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int mid = l + (r - l) / 2;

            // Recursively sort first and second halves
            mergeSortImpl(arr, l, mid);
            mergeSortImpl(arr, mid + 1, r);

            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int arr[], int l, int mid, int r) {
        int temp[] = new int[r - l + 1]; // Temporary array
        int i = l;       
        int j = mid + 1;
        int k = 0;       

        // Compare elements from both halves and copy the smaller element
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[i++];
            }
        }

        // Copy remaining elements of left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half, if any
        while (j <= r) {
            temp[k++] = arr[j++];
        }

        // Copy temp array back into original array arr[l..r]
        for (i = l, k = 0; i <= r; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 1, 9, 3, 0};

        // Call mergeSort starting from index 0 to length - 1
        mergeSortImpl(arr, 0, arr.length - 1);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}