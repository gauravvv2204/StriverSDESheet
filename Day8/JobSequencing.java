//https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1#
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a,b)->Double.compare(b.profit,a.profit));
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int totalProfit = 0;
        for(int i=0; i<n; i++){
            int j = arr[i].deadline-1;
            while(j>=0 && set.contains(j)){
                j--;
            }
            if(j>=0){
                count++;
                totalProfit+=arr[i].profit;
                set.add(j);
            }
        }
        return new int[]{count,totalProfit};
    }
}
