import java.util.*;

class subsets {

    List<List<Integer>> result = new ArrayList<>();

    void subsets_all(int index, int arr[], List<Integer> temp) {
        if (index >= arr.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // Include current element
        temp.add(arr[index]);
        subsets_all(index + 1, arr, temp);

        // Remove current element
        temp.remove(temp.size() - 1);

        // Don't include current element
        subsets_all(index + 1, arr, temp);
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3};

        List<Integer> temp = new ArrayList<>();

        subsets s = new subsets();

        s.subsets_all(0, arr, temp);

        // Print result
        System.out.println(s.result);
    }
}
