//https://leetcode.com/problems/sudoku-solver/submissions/
class Solution {
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
    boolean helper(char[][] board,int i,int j){
        if(i==8 && j==9){
            return true;
        }
        if(j==9){
            return helper(board,i+1,0);
        }
        if(board[i][j]=='.'){
            for(int num=1; num<=9; num++)
            {
                char c = (char)(num+'0');
                if(check(board,i,j,c)){
                    board[i][j] = c;
                    if(!helper(board,i,j+1))
                    board[i][j] = '.';
                    else{
                        return true;
                    }
                }
            } 
        }
        else{
             return helper(board,i,j+1);
        }
        return false;
    }
    boolean check(char[][] board,int i,int j,char c){
        //column check
        for(int row = 0; row<9; row++){
            if(board[row][j]==c)
                return false;
        }
        //row check
        for(int col = 0; col<9; col++){
            if(board[i][col]==c)
                return false;
        }
        
        //square check
        int rowStart = (i/3)*3;
        int colStart = (j/3)*3;
        for(int row=rowStart; row<rowStart+3; row++){
            for(int col=colStart; col<colStart+3; col++){
                    if(board[row][col]==c){
                        return false;
                    }
            }
        }
        return true;
    }
}
