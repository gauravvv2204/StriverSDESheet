//https://leetcode.com/problems/subsets-ii/submissions/
class Solution {
    HashSet<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans  = new ArrayList<>();
        helper(nums,new ArrayList<>(),ans,0,nums.length);
        return ans;
    }
    // void helper(int[] arr,List<Integer> list, List<List<Integer>> ans,int i,int N){
    //     if(i==N){
    //         if(!set.contains(list)){
    //             List<Integer> temp = new ArrayList<>(list);
    //             ans.add(temp);
    //             set.add(temp);
    //         }
    //         return;
    //     }
    //     list.add(arr[i]);
    //     helper(arr,list,ans,i+1,N);
    //     list.remove(list.size()-1);
    //     helper(arr,list,ans,i+1,N);
    // }
    void helper(int[] arr,List<Integer> list, List<List<Integer>> ans,int i,int N){
        ans.add(new ArrayList<>(list));
        for(int j=i; j<N; j++){
            if(j!=i && arr[j]==arr[j-1]) continue;
            list.add(arr[j]);
            helper(arr,list,ans,j+1,N);
            list.remove(list.size()-1);  
        }
    }
}
