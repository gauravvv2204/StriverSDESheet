//https://www.codingninjas.com/codestudio/problems/chess-tournament_981299?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.*;
public class Solution {

    public static int chessTournament(int[] positions, int n,  int c) 
	{
        Arrays.sort(positions);
        int lo=1;
        int hi=positions[n-1]-positions[0];
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int co = 0;
            for(int i=0,prev=-1; i<positions.length; i++){
                if(prev==-1 || positions[i]-positions[prev]>=mid){
                    prev = i;
                    co++;
                }
            }
            if(co>=c){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return hi;
    }

}
