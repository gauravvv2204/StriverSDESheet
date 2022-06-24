//https://leetcode.com/problems/n-queens/submissions/
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] grid = new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(grid[i],'.');
        }
        int[] x = new int[n];
        List<List<String>> ans = new ArrayList<>();
        NQueens(0,n,grid,x,ans);
        return ans;
    }
    void NQueens(int row,int n, char[][] grid, int[] x,List<List<String>> ans){
        if(row==n){
            ans.add(build(grid));
            return;
        }
        for(int col=0; col<n; col++){
            if(check(x,row,col)){
                x[row] = col+1;
                grid[row][col]='Q';
                NQueens(row+1,n,grid,x,ans) ;
                x[row] = 0;
                grid[row][col]='.';
            }
        }
    }
    boolean check(int[] x,int row,int col){
        for(int i=0; i<row; i++){
            if(x[i]==col+1 || Math.abs(i-row)==Math.abs(x[i]-(col+1))){
                return false;
            }
        }
        return true;
    }
    List<String> build(char[][] grid){
        List<String> sol = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            sol.add(new String(grid[i]));
        }
        return sol;
    }
}
