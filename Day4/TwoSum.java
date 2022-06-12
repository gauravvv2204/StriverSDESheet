//https://leetcode.com/problems/two-sum/submissions/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                ans = new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
