//https://leetcode.com/problems/combination-sum/submissions/
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,new ArrayList<>(),ans,0,target,candidates.length);
        return ans;
    }
     void helper(int[] arr,List<Integer> list, List<List<Integer>> ans,int i,int sum,int N){
        for(int j=i; j<N; j++){
            if(sum-arr[j]>0){
                list.add(arr[j]);
                helper(arr,list,ans,j,sum-arr[j],N);
                list.remove(list.size()-1);
            }
            else if(sum-arr[j]==0){
                list.add(arr[j]);
                ans.add(new ArrayList<>(list));
                list.remove(list.size()-1);
                break;
            }
            else{
                break;
            }
        }
    }
}
