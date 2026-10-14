


class Solution {
    public int countPeaks(int[] nums) {
        // Your code here

        int ans = 0;

        // nums = [1, 3, 2, 5, 4]

        int count = 0;



        for ( int i = 1; i < nums.length; i ++){


          if (i+1<nums.length && nums[i ] > nums[i-1] && nums [i] > nums[i+1] ){
            count ++;
          }

          if ( i == nums.length-1 && nums[i] > nums[i-1] && nums[0]> nums[i]){
            count ++;
          }

        }



        return count ;
    }
}

class Solution {
    public int[] calculateSums(int[] nums) {
        // Your code here

        // nums = [1, 3, 2, 6, 5, 8]

        int n = nums.length;

        int evenSum = 0;
        int oddSum = 0;

        for ( int i = 1; i < n; i++){

          if ( nums[i] % 2 == 0 && nums[i]> nums[i-1]){
            evenSum = evenSum + nums[i];
            
          }else if ( nums[i] != 0 && nums[i] > nums[i-1]){
            oddSum = oddSum + nums[i];
          }

        }

        return new int []{ evenSum , oddSum};

    }
}



