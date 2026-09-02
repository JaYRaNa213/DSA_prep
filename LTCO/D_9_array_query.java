// public class D_9_array_query {
//   public static void main(String[] args) {

//     int[] num1={1,2,3,4};
//     int[] num2={7,8,9};
//     solution obj =new solution();
//     obj.merge(num1,num2);
//     obj.findMedianSorted(num1, num2);

    
//   }
// }

// class solution{

    
//     public double findMedianSorted(int[] num1,int[] num2){
//       int [] ans=merge(num1,num2);

      
//       if(ans.length %2 ==0){
//         double ans2=(double)(ans[ans.length/2]+ans[ans.length/2-1])/2;
//         return ans2;
//       }
//       else{
//         double ans2=(double)(ans[ans.length/2]);
//         return ans2;
//       }
      

//     }
//     public int[] merge(int[] arr1,int[] arr2){
//       int[] ans=new int[arr1.length +arr2.length] ;
//       int p1=0;
//       int p2=0;
//       int p3=0;

//       while (p1<arr1.length || p2<arr2.length) {
//         int value1 = p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;
//         int value2 = p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE;

//         if(value1<value2){
//           ans[p3] =value1;
//           p1 ++;
//         }  

//         else {
//           ans[p3] = value2;
//         }  

//         p3++;
      
        
//       }
//       return ans;


//     }

// }


public class D_9_array_query {
  public static void main(String[] args) {
      int[] num1 = {1, 2, 3, 4};
      int[] num2 = {7, 8, 9,10};
      solution obj = new solution();
      obj.merge(num1, num2);
      double median = obj.findMedianSorted(num1, num2);
      System.out.println("Median: " + median);
  }
}

class solution {
  public double findMedianSorted(int[] num1, int[] num2) {
      int[] ans = merge(num1, num2);

      if (ans.length % 2 == 0) {
          double ans2 = (double) (ans[ans.length / 2] + ans[ans.length / 2 - 1]) / 2;
          return ans2;
      } else {
          double ans2 = (double) (ans[ans.length / 2]);
          return ans2;
      }
  }

  public int[] merge(int[] arr1, int[] arr2) {
      int[] ans = new int[arr1.length + arr2.length];
      int p1 = 0;
      int p2 = 0;
      int p3 = 0;

      while (p1 < arr1.length || p2 < arr2.length) {
          int value1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
          int value2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;

          if (value1 < value2) {
              ans[p3] = value1;
              p1++;
          } else {
              ans[p3] = value2;
              p2++;
          }

          p3++;
      }
      return ans;
  }
}
