import java.util.ArrayList;
import java.util.List;
class nQueens {

    public boolean isSafe(int row, int col, char[][] board){

        //Horizontal
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //Vertical
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //Upper left
        int r = row;
        for(int c = col; c >= 0 && r >= 0; r --, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //Upper right
        r = row;
        for(int c = col; c < board.length && r >= 0; r--, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //Lower left
        r = row;
        for(int c = col; c >= 0 && r < board.length; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //Lower right
        r = row;
        for(int c = col; c < board.length && r < board.length; r ++, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public void helper(List<List<String>> allBoards, char[][] board, int col){
        if (col == board.length){
            saveBoard(allBoards, board);
            return;
        }
        for(int row= 0; row < board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(allBoards, board, col+1);
                board[row][col] = '.';
            }
        }
    }

    public void saveBoard(List<List<String>> allBoards, char[][] board){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            row ="";
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }
                else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(allBoards, board, 0);
        return allBoards;
    }

    public static void main(String args[]){ 
        int n;
        System.out.println("Enter the value of n: ");
        n = new java.util.Scanner(System.in).nextInt();
        nQueens obj = new nQueens();
        List<List<String>> ans = obj.solveNQueens(n);
        System.out.println(ans);
    }
}