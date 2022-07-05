//https://leetcode.com/problems/kth-largest-element-in-an-array/
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> prq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            prq.add(nums[i]);
            if(prq.size()>k){
                prq.poll();
            }
        }
        return prq.poll();
    }
}
