//https://www.codingninjas.com/codestudio/problems/873378?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.ArrayList;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		int lo = 1; 
        int hi = (int)1e5;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int count = 0;
            for(int i=0; i<matrix.size(); i++){
                int l=0;
                int h=matrix.get(i).size()-1;
                while(l<=h){
                    int m = (l+h)/2;
                    if(matrix.get(i).get(m)<=mid){
                        l=m+1;
                    }
                    else{
                        h=m-1;
                    }
                }
                count+=(h+1);
            }
            if(count<=(matrix.size()*matrix.get(0).size())/2){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return lo;
	}
}
