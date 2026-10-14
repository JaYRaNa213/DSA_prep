class sums{


  public static int sumss(int arr[]){
    int sum=0;

    int i = 0;
    while(i<arr.length){

      sum = sum+arr[i];
      if(i+1 <arr.length)
        {sum = sum-arr[i+1];}
      i= i+2;

    }
    return Math.abs(sum);
  }
  public static void main (String []args){
    int arr[] = {9,8,7,6,5};

    int ans = sumss(arr);
    System.out.println(ans);
  }
}