class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    if(!isPossible(board,i,j)){
                        return false;
                    }
                }
                
            }
        }
        return true;
        
    }
    public static boolean isPossible(char[][] board,int row,int col){
        for(int i = 0 ; i < board.length ; i++){
            if(i == row){
                continue;
            }

            else if(board[i][col] == board[row][col]){
                return false;
            }
        }

        // check for all cols
        for(int i = 0 ; i < board[0].length ; i++){
            if(i == col){
                continue;
            }

            else if(board[row][i] == board[row][col]){
                return false;
            }
        }

        int r = row - (row % 3);
        int c = col - (col % 3);
        for(int i = r ; i < r+3 ; i++){
            for(int j = c ; j < c+3 ; j++){
                if(i == row && j == col){
                    continue;
                }
                else if(board[i][j] == board[row][col]){
                    return false;
                }
            }
        }

        return true;

    }
}