//https://leetcode.com/problems/max-consecutive-ones/submissions/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        if(nums[0]==1) count = 1;
        int max = count==1?1:0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==1)
                count++;
            else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        max = Math.max(max,count);
        return max;
    }
}
