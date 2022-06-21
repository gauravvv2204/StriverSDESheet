//https://practice.geeksforgeeks.org/problems/subset-sums2234/1
//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr,ans,0,N,0);
        return ans;
    }
    void helper(ArrayList<Integer> arr, ArrayList<Integer> ans,int i,int N,int sum){
        if(i==N){
            ans.add(sum);
            return;
        }
        helper(arr,ans,i+1,N,sum+arr.get(i));
        helper(arr,ans,i+1,N,sum);
    }
}
