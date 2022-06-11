//https://leetcode.com/problems/powx-n/submissions/
class Solution {
    public double myPow(double x, int n) {
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        if(n<0){
            x = 1/x;
            if(n!=-2147483648)
            n = -n;
            else{
                n = 2147483647;
                x = Math.abs(x);
            }
        }
        return n%2==0?myPow(x*x,n/2):x*myPow(x*x,n/2);
    }
}
