//https://leetcode.com/problems/permutations/submissions/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,new ArrayList<>(),ans);
        return  ans;
    }
    void helper(int[] nums,int i,List<Integer> list, List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        for(int j=0; j<=list.size(); j++){
            list.add(j,nums[i]);
            helper(nums,i+1,list,ans);
            list.remove(j);
        }
    }
}
