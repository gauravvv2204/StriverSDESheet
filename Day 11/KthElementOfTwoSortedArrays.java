//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1#
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length && i+j<k-1){
            if(arr1[i]<=arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        if(i<arr1.length && j<arr2.length){
            return Math.min(arr1[i],arr2[j]);
        }
        else if(i<arr1.length){
            return arr1[i-1+(k-(i+j))];
        }
        return arr2[j-1+(k-(i+j))];
        
    }
}
