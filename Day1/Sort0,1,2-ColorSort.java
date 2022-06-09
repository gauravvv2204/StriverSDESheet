//https://leetcode.com/problems/sort-colors/submissions/
class Solution {
    public void sortColors(int[] nums) {
        //Counting Sort - T.C-O(2*N)  S.C - O(3) For 0,1,2
        // int[] map = new int[3];
        // for(int i=0; i<nums.length; i++){
        //     map[nums[i]]++;
        // }
        // int index = 0;
        // for(int i=0; i<map.length; i++){
        //     int size = map[i];
        //     while(size-->0){
        //         nums[index++] = i;
        //     }
        // }
        
        //------------------------------------------------------------
        //DNF Sort T.C - O(N)
        int m=0,l=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
                l++;
                m++;
            }
            else if(nums[m]==1) m++;
            else{
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }
        }
    }
    
}
