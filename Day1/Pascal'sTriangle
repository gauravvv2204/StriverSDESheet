//https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=1; j<i-1; j++){
                int val = list.get(i-2).get(j-1)+list.get(i-2).get(j);
                temp.add(val);
            }
            if(i>1)
            temp.add(1);
            list.add(temp);
        }
        return list;
    }
}
