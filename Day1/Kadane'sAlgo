//https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            max = Math.max(max,curr+nums[i]);
            if(nums[i]+curr<0)
            {
                curr = 0;
            }
            else{
                curr = curr + nums[i];
            }
        }
        return max;
    }
}
