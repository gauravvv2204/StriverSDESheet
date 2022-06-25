//https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
       ArrayList<String> ans = new ArrayList<>();
       int[][] visited = new int[n][n];
       if(m[0][0]==1){
           helper(m,0,0,"",ans,visited);
       }
       return ans;
    }
    public static void helper(int[][] m,int i,int j,String move,List<String> ans,int[][] visited){
        if(i==m.length-1 && j==m.length-1)
        {
            ans.add(move);
            return;
        }
        //up
        if(i-1>=0 && visited[i-1][j]==0 && m[i-1][j]==1){
            visited[i][j] = 1;
            helper(m,i-1,j,move+'U',ans,visited);
            visited[i][j] = 0;
        }
        //down
        if(i+1<m.length && visited[i+1][j]==0 && m[i+1][j]==1){
            visited[i][j] = 1;
            helper(m,i+1,j,move+'D',ans,visited);
            visited[i][j] = 0;
        }
        //left
        if(j-1>=0 && visited[i][j-1]==0 && m[i][j-1]==1){
            visited[i][j] = 1;
            helper(m,i,j-1,move+'L',ans,visited);
            visited[i][j] = 0;
        }
        //right
        if(j+1<m.length && visited[i][j+1]==0 && m[i][j+1]==1){
            visited[i][j] = 1;
            helper(m,i,j+1,move+'R',ans,visited);
            visited[i][j] = 0;
        }
    }
}
