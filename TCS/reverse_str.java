import java.util.*;

public class reverse_str {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char arr[] = str.toCharArray();

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {

            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }

        String str2 = new String(arr);
        System.out.print(str2);
    }
}