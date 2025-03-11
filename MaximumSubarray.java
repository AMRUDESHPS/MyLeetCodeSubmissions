/*
 * 53. Maximum Subarray
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int i, currSum = 0, maxSum = Integer.MIN_VALUE;

        for (i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
}
