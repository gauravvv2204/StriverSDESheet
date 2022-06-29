//https://www.codingninjas.com/codestudio/problems/ayush-gives-ninjatest_1097574?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0
public class Solution {
    public static long ayushGivesNinjatest(int N, int m, int[] time) {
        int max = time[0];
        long sum = max;
        for(int i=1; i<m; i++){
            sum+=time[i];
            max = Math.max(max,time[i]);
        }
        long lo = max;
        long hi = sum;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            long curr = 0;
            long n = 0;
            for(int i=0; i<m; i++){
                if(curr+time[i]<=mid){
                    curr+=time[i];
                }
                else{
                    curr = time[i];
                    n++;
                }
            }
            n++;
            if(n<=N){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return lo;
    }
}
