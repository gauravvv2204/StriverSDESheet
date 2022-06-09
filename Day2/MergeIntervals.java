//https://leetcode.com/problems/merge-intervals/submissions/
class Solution {
    public int[][] merge(int[][] intervals) {
        //since we dont know the size of ans we take a dynamic list
        List<List<Integer>> list = new ArrayList<>();
        //sort the array based on start time
        Arrays.sort(intervals,(a,b)->Double.compare(a[0],b[0]));
        //add first row as base
        list.add(new ArrayList<>(Arrays.asList(intervals[0][0],intervals[0][1])));
        //main processing
        for(int i=1; i<intervals.length; i++){
            int size = list.size();
            int second = list.get(size-1).get(1);
            if(intervals[i][0]<=second){
                list.get(size-1).set(1,Math.max(intervals[i][1],second));
            }
            else{
                list.add(new ArrayList<>(Arrays.asList(intervals[i][0],intervals[i][1])));
            }
        }
        //transfer your answer to matrix of known size
        int[][] ans = new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
            
        }
        return ans;
    }
}
