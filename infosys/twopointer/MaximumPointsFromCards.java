public class MaximumPointsFromCards {

    public static int maxScore(int[] nums, int k) {
        int leftsum = 0;
        int rightsum = 0;
        // let k = 4 
        for ( int i = 0 ; i <= k-1; i ++){
            leftsum = leftsum + nums[i];
        }
        int maxsum = leftsum;
        int rightIndex= nums.length-1;
        for ( int i =k-1; i >=0; i--){
            leftsum = leftsum - nums[i];
            rightsum = rightsum + nums[rightIndex];
            maxsum = Math.max(rightsum + leftsum , maxsum);
            rightIndex--;
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        System.out.println(maxScore(nums, k));
    }
}