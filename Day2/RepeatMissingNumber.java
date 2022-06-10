//https://www.interviewbit.com/problems/repeat-and-missing-number-array/hints/
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] arr) {
        for(int i=0; i<arr.length;){
            int correctPos = arr[i]-1;
            if(arr[correctPos]!=arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[correctPos];
                    arr[correctPos] = temp;
            }
            else{
                i++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=i+1){
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{};
    }
}
