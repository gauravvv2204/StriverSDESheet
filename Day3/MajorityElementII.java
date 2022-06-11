//https://leetcode.com/problems/majority-element-ii/submissions/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Arrays.sort(nums);
        int req = nums.length/3;
        List<Integer> ans = new ArrayList<>();
        // int count = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(i==0 || nums[i]==nums[i-1]){
        //         count++;
        //     }
        //     else{
        //         count = 1;
        //     }
        //     if(count > req)
        //     {
        //         ans.add(nums[i]);
        //         while(i+1<nums.length && nums[i+1]==nums[i]){
        //             i++;
        //         }
        //     }
        // }
        // return ans;
        int cand1 = -1,cand2 = -1,count1 = 0, count2 = 0;
        for(int elem:nums){
            if(elem==cand1) count1++;
            else if(elem==cand2) count2++;
            else if(count1 == 0) {
                count1 = 1;
                cand1 = elem;
            }
            else if(count2 == 0) {
                count2 = 1;
                cand2 = elem;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int elem:nums){
            if(elem==cand1) count1++;
            else if(elem==cand2) count2++;
        }
        if(count1>req) ans.add(cand1);
        if(count2>req) ans.add(cand2);
        return ans;
    }
}
