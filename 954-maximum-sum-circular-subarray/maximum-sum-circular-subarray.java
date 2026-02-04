class Solution {
    public int maxKadane(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currSum < 0) currSum = 0;
            currSum += nums[i];
            max = Math.max(max, currSum);
        }

        return max;
    }

    public int minKadane(int[] nums) {
        int min = Integer.MAX_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(currSum > 0) currSum = 0;
            currSum += nums[i];
            min = Math.min(min, currSum);
        }

        return min;
    }

    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for(int a : nums) totalSum += a;
        
        int maxSum = maxKadane(nums);
        int minSum = minKadane(nums);
        int cirSum = totalSum - minSum;

        if (maxSum <= 0) return maxSum;

        return Math.max(maxSum, cirSum);
      
    }

}