// https://leetcode.com/problems/find-the-duplicate-number/
class Solution {
    public int findDuplicate(int[] nums) {
        // int[] hash = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     hash[nums[i]]++;
        // }
        // for(int i=1; i<hash.length; i++){
        //     if(hash[i]>=2)
        //         return i;
        // }
        // return 0;
        
        //floyd cycle detection
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
