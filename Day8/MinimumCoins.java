//https://www.codingninjas.com/codestudio/problems/975277?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        int[] coins = {1000,500,100,50,20,10,5,2,1};
    int ans = 0;
    for(int i=0; i<coins.length && amount>0; i++){
        if(amount>=coins[i]){
            ans+=amount/coins[i];
            amount = amount%coins[i];
        }
    }
    return ans;
    }
}
