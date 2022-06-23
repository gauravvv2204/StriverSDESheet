class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s,0,new ArrayList<>(),ans);
        return ans;
    }
    void helper(String s,int i,List<String> list,List<List<String>> ans){
        if(i==s.length()){
            ans.add(new ArrayList(list));
            return;
        }
        for(int j=i; j<s.length(); j++){
            int k = i;
            int l = j;
            while(k<l){
                if(s.charAt(k)==s.charAt(l)){
                    k++;
                    l--;
                }
                else {
                    break;
                }
            }
            if(k>=l){
                list.add(s.substring(i,j+1));
                helper(s,j+1,list,ans);
                list.remove(list.size()-1);
            }

        }
    }
}
