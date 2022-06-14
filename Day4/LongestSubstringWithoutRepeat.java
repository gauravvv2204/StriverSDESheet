//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int max = 0;
        int curr = 0;
        while(i<s.length()){
            HashSet<Integer> set = new HashSet<>();
            while(i<s.length()){
                int val = (int)s.charAt(i);
                if(!set.contains(val)){
                    curr++;
                    set.add(val);
                    i++;
                }
                else{
                    max = Math.max(curr,max);
                    int removeVal = (int)(s.charAt(i-curr));
                    set.remove(removeVal);
                    curr = curr-1;
                }
            }
        }
        max = Math.max(max,curr);
        return max;
    }
}
