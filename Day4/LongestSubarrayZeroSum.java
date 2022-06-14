//https://www.codingninjas.com/codestudio/problems/920321?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        for(int i=0; i<arr.size(); i++){
            sum = sum+arr.get(i);
            if(sum == 0){
                max = Math.max(max,i+1);
                continue;
            }
            if(map.containsKey(sum)){
                max = Math.max(max,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
		return max;
	}
}
