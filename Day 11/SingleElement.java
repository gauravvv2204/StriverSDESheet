//https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if((mid==0 || nums[mid]!=nums[mid-1]) && (mid==nums.length-1 || nums[mid]!=nums[mid+1]))               {
                return nums[mid];
            }
            else if(mid>0 && nums[mid]==nums[mid-1]){
                if((mid-lo)%2==0) hi = mid-2;
                else lo = mid+1;
            }
            else{
                if((mid-lo)%2==0) lo = mid+2;
                else hi = mid-1;
            }
        }
        return nums[hi];
    }
}
