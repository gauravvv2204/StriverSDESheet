//https://www.codingninjas.com/codestudio/problems/983635?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.ArrayList;
import java.util.*;
public class Solution {
    static HashSet<String> set;
    static ArrayList<String> ans;
	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		set = new HashSet<>();
        ans = new ArrayList<>();
        for(int i=0; i<dictionary.size(); i++){
            set.add(dictionary.get(i));
        }
        helper(s,new StringBuilder(),0);
        return ans;
	}
    public static void helper(String s,StringBuilder processed,int i){
        if(i==s.length()){
            ans.add(processed.toString());
            return;
        }
        for(int j=i; j<s.length(); j++){
            if(set.contains(s.substring(i,j+1))){
                processed.append(s.substring(i,j+1));
                if(j!=s.length()-1)
                processed.append(" ");
                helper(s,processed,j+1);
                if(j!=s.length()-1)
                processed.delete(processed.length()-(j+2-i),processed.length());
                else{
                processed.delete(processed.length()-(j+1-i),processed.length());
                }
            }
        }
    }
}
