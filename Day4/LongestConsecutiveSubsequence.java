//https://leetcode.com/problems/longest-consecutive-sequence/submissions/
class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length==0)
        //     return 0;
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     max = Math.max(max,nums[i]);
        //     min = Math.min(min,nums[i]);
        //     set.add(nums[i]);
        // }
        // int count = 1;
        // int consecutiveMax = 1;
        // for(int i=min+1; i<=max; i++){
        //     if(set.contains(i)){
        //         count++;
        //         set.remove(i);
        //     }
        //     else{
        //         consecutiveMax = Math.max(consecutiveMax,count);
        //         count = 0;
        //         if(set.size()<consecutiveMax) break;
        //     }
        // }
        // consecutiveMax = Math.max(consecutiveMax,count);
        // return consecutiveMax;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int max = 0;
        for(int i : nums){
            if(set.contains(i-1)) continue;
            else{
                int num = i+1;
                int count = 1;
                while(set.contains(num)){
                    num++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
