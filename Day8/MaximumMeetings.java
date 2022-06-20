//https://www.codingninjas.com/codestudio/problems/1062658?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.*;
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        int n = start.length;
        int[][] meetings = new int[n][3];
        for(int i=0; i<n; i++){
            meetings[i][0] = i+1;
            meetings[i][1] = start[i];
            meetings[i][2] = end[i];
        }
        Arrays.sort(meetings, (a,b)-> {
            if(a[2] == b[2]){
                return a[0] - b[0];
         }
         return a[2] - b[2];
  });
        int endi = -1;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(meetings[i][1]>endi){
                ans.add(meetings[i][0]);
                endi = meetings[i][2];
            }
        }
        return ans;
        
    }
}
