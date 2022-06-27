//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        int pivot = -1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(nums[mid]==target)
                return mid;
            if((mid>0 && nums[mid]<nums[mid-1])){
                pivot = mid;
                break;
            }
            else if((mid<nums.length-1 && nums[mid]>nums[mid+1])){
                pivot = mid+1;
                break;
            }
            else if(nums[mid]>=nums[lo]){
                lo=mid+1;
            }
            else{
                hi = mid;
            }
        }
        if(pivot==-1){
            return search(nums,target,0,nums.length-1);
        }
        else{
            int ans1 = search(nums,target,0,pivot-1);
            int ans2 = search(nums,target,pivot,nums.length-1);
            return ans1>ans2?ans1:ans2;
        }
        
    }
    int search(int[] nums,int target,int i,int j){
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target) i=mid+1;
            else j=mid-1;
        }
        return -1;
    }
    
}
