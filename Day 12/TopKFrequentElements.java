//https://leetcode.com/problems/top-k-frequent-elements/submissions/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->(a.second-b.second));
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int distinct = map.size();
        for(int i=0; i<nums.length; i++){
            if(distinct==0)
                break;
            if(map.containsKey(nums[i])){
                pq.add(new Pair(nums[i],map.get(nums[i])));
                if(pq.size()>k){
                    pq.poll();
                }
                map.remove(nums[i]);
                distinct--;
            }
        }
        int[] out = new int[pq.size()];
        int i = 0;
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            out[i++] = temp.first;
        }
        return out;
    }
}
class Pair{
    public int first;
    public int second;
    Pair(){
        
    }
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
