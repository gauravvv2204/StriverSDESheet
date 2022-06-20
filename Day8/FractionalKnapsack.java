//https://www.codingninjas.com/codestudio/problems/975286?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.*;
public class Solution {
    public static double maximumValue(Pair[] item, int n, int w) {
        Arrays.sort(item, (a,b)->Double.compare((double)(b.value)/b.weight,(double)(a.value)/a.weight));
        double profit = 0.0;
        for(int i=0; i<n; i++){
            if(item[i].weight<=w){
                profit+=item[i].value;
                w-=item[i].weight;
            }
            else{
                profit=profit+((double)item[i].value/item[i].weight)*w;
                break;
            }
        }
        return profit;
    }
}
