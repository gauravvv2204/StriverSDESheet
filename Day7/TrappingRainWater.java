//https://leetcode.com/problems/trapping-rain-water/submissions/
class Solution {
    public int trap(int[] height) {
        int n = height.length; 
        // int[] suffix = new int[n];
        // int max = 0;
        // for(int i=n-1; i>=0; i--){
        //     max = Math.max(max,height[i]);
        //     suffix[i] = max;
        // }
        // int ans = 0;
        // max = 0;
        // for(int i=0; i<n; i++){
        //     max = Math.max(max,height[i]);
        //     ans+=Math.min(max,suffix[i])-height[i];
        // }
        // return ans;
        int i=0,j=n-1;
        int lmax = 0;
        int rmax = 0;
        int ans = 0;
        while(i<=j){
            lmax = Math.max(lmax,height[i]);
            rmax = Math.max(rmax,height[j]);
            if(lmax<=rmax){
                ans+=(lmax-height[i++]);
            }
            else ans+=(rmax-height[j--]);
        }
        return ans;
    }
}
