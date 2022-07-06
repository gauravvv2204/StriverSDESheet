//https://www.codingninjas.com/codestudio/problems/min-heap_4691801?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.*;
public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        Heap hp = new Heap();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(q[i][0]==0){
                hp.insert(q[i][1]);
                }
            else{
                ans.add(hp.delete());
            }
        }
        int[] fans = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            fans[i] = ans.get(i);
        }
        return fans;
    }
}

class Heap{
    List<Integer> list;
    int size;
    Heap(){
        list = new ArrayList<>();
        list.add(-1);
        size = 0;
    }
    public void insert(int num){
        size = size+1;
        list.add(num);
        int currIndex = size;
        int parentIndex = (currIndex)/2;
        while( parentIndex > 0 && list.get(parentIndex)>list.get(currIndex)){
            int temp = list.get(parentIndex);
            list.set(parentIndex,list.get(currIndex));
            list.set(currIndex,temp);
            currIndex = parentIndex;
            parentIndex = currIndex/2;
        }
    }
    public int delete(){
        int index = 1;
        int val = list.get(index);
        list.set(index,list.get(size));
        list.remove(size);
        size = size - 1;
        
        int smallest;
        while(index<size){
            smallest = index;
        if(2*index<=size && list.get(2*index)<list.get(smallest))
            smallest = 2*index;
        if(2*index+1<=size && list.get(2*index+1)<list.get(smallest))
            smallest = 2*index+1;
        if(smallest!=index){
            int temp = list.get(smallest);
            list.set(smallest,list.get(index));
            list.set(index,temp);
            index = smallest;
        }
        else{
            break;
        }
        }
        return val;
    }
}
