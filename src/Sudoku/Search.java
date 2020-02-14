package Sudoku;

public class Search {

    public boolean linearRow(int number, int[][] board, int n) {


        int lengthOfBoard = board[0].length;

        for (int i = 0; i < lengthOfBoard-1; i++){
            if (n != i){
                //search each number in the row, if it contains "number"
                if (board[0][i] == number){
                    //return yes it contains "number"
                    return true;
                }
                //if it doesn't contain the number, check the next cell/element
                else{
                    i=i;
                }
            }

        }
        return false;
    }

    public boolean linearColumn(int number, int[][] board, int n) {


        int lengthOfBoard = board.length;

        for (int i = 0; i < lengthOfBoard-1; i++){
            if (n != i){
                //search each number in the column, if it contains "number"
                if (board[i][0] == number){
                    //return yes it contains "number"
                    return true;
                }
                //if it doesn't contain the number, check the next cell/element
                else{
                    i=i;
                }
            }

        }
        return false;
    }
}