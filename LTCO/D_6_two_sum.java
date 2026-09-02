public class D_6_two_sum {
  public static void main(String[] args) {
    
  int[] nums={1,2,3,5,9,};
  int target = 5;

  solution obj=new solution();
  obj.two_sum(nums,target);
    
  }


  
}



class solution{
  public int[] two_sum(int[] nums,int target){
    
    int[] ans= new int[2];

    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        if(nums[i] +nums[j] == target){

          ans[0]=i;
          ans[1]=j;
          break;
        }


      }
    }
    return ans;
  }

  
}