//https://leetcode.com/problems/reverse-pairs/submissions/
class Solution {
     int ans;
    public int reversePairs(int[] arr) {
        sort(arr,0,arr.length-1);
        return ans;
    }
    private void sort(int[] arr,int s,int e) {
        if ((e - s) != 0) {
            int mid = (s + e) / 2;
            sort(arr, s, mid);
            sort(arr, mid + 1, e);
            merge(arr, s, mid, e);
        }
    }

    private void merge(int[] arr, int s, int mid, int e) {
        int i = s, j = mid+1, k = 0;
        int[] merge = new int[e-s+1];
        for(i=s;i<=mid;i++) {
            while(j<=e && arr[i] > (2 * (long) arr[j])) {
                j++;
            }
            ans += (j - (mid+1));
        }
        i=s;
        j=mid+1;
        while(i<=mid && j<=e)
        {
            if(arr[i]<=arr[j])
            {
                merge[k++]=arr[i++];
            }
            else
            {
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
