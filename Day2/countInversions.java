//https://www.codingninjas.com/codestudio/problems/count-inversions_615?leftPanelTab=1
import java.util.* ;
import java.io.*; 
public class Solution {
    static long ans;
    public static long getInversions(long arr[], int n) {
       sort(arr,0,arr.length-1);
        return ans;
    }
    private static void sort(long[] arr,int s,int e) {
        if ((e - s) != 0) {
            int mid = (s + e) / 2;
            sort(arr, s, mid);
            sort(arr, mid + 1, e);
            merge(arr, s, mid, e);
        }
    }

    private static void merge(long[] arr, int s, int mid, int e) {
        int i = s, j = mid+1, k = 0;
        long[] merge = new long[e-s+1];
        while(i<=mid && j<=e)
        {
            if(arr[i]<=arr[j])
            {
                merge[k++]=arr[i++];
            }
            else
            {
                ans+=(mid-i+1);
                merge[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            merge[k++]=arr[i++];
        }
        while (j<=e) {
            merge[k++] =arr[j++];
        }
        System.arraycopy(merge, 0, arr, s + 0, merge.length);
    }
}
