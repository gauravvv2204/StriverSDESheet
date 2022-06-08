//https://leetcode.com/problems/next-permutation/submissions/
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length-1;
        int i,j;
        //finding the element before the peak
        for(i=n-1; i>=0; i--){
            if(nums[i]<nums[i+1])
                break;
        }
        //if found replace it with the rightmost greater element
        if(i!=-1){
            for(j=n; j>i; j--){
                if(nums[j]>nums[i])
                    break;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        i+=1;
        j=n;
        //sort to get next permutation
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
