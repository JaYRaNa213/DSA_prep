import java.util.*;

class fruits {

    public static void main(String[] args) {

        int arr[] = {3,3,3,1,2,1,1,2,3,3,4};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;
        int len = 0;
        int maxlen = 0;

        while (r < arr.length) {

            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while (map.size() > k) {

                map.put(arr[l], map.get(arr[l]) - 1);

                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }

                l++;
            }

            len = r - l + 1;
            maxlen = Math.max(maxlen, len);

            r++;
        }

        System.out.print(maxlen);
    }
}
