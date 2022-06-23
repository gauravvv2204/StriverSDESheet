//https://leetcode.com/problems/permutation-sequence/
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int fact = 1;
        for(int i=0; i<n; i++){
            list.add(i+1);
            fact*=(i+1);
        }
        fact/=n;
        k=k-1;
        StringBuilder sb = new StringBuilder();
        while(k>0){
            int index = k/fact;
            sb.append(list.get(index));
            k = k%fact;
            list.remove(index);
            fact/=list.size();  
        }
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
