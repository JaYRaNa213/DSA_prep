
// import java.util.*;

// public class parking {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         int[][] arr = new int[r][c];
//         HashMap<Integer, Integer> map = new HashMap<>();

//         int maxc = 0;

//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for (int i = 0; i < r; i++) {

//             int count = 0;

//             for (int j = 0; j < c; j++) {

//                 if (arr[i][j] == 1) {
//                     count++;

//                 }

//             }
//             map.put(i, count);

//         }

//         int maxValue = Collections.max(map.values());

//         for (int key : map.keySet()) {
//             if (map.get(key) == maxValue) {
//                 System.out.println(key);
//             }
//         }

//     }
// }



