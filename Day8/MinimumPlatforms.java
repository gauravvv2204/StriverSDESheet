//https://www.codingninjas.com/codestudio/problems/799400?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
//         int[][] schedule = new int[n][2];
//         for(int i=0; i<n; i++){
//             schedule[i][0] = at[i];
//             schedule[i][1] = dt[i];
//         }
//         Arrays.sort(schedule, (a,b)-> {
//             if(a[0]==b[0])
//             return a[1]-b[1];
//          return a[0] - b[0];
//   });
        
        
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int flag;
//         for(int i=0; i<n; i++){
//             flag = 0;
//             for(int j=1; j<=map.size(); j++){
//                 if(map.get(j)<schedule[i][0]){
//                     map.put(j,schedule[i][1]);
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag==0){
//                     map.put(map.size()+1,schedule[i][1]);
//                 }
//         }
//         return map.size();
        Arrays.sort(at);
        Arrays.sort(dt);
        int minplatforms = 0;
        int currplatforms = 0;
        int i=0;
        int j=0;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                currplatforms++;
                i++;
            }
            else{
                currplatforms--;
                j++;
            }
            minplatforms=Math.max(minplatforms,currplatforms);
        }
        return minplatforms;
    }
}
