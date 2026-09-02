public class FindMissing {

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 3, 5, 6};

        int xor1 = 0;
        int xor2 = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= arr.length; i++) {
            xor1 ^= i;
        }

        // XOR all array elements
        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
        }

        System.out.println(xor1 ^ xor2);
    }
}