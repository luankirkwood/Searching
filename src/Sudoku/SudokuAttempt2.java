package Sudoku;

import java.util.Arrays;

public class SudokuAttempt2 {
    public static void main(String[] args) {

        int[][] board = new int[][]{
                {0, 0, 0, 0, 0, 2, 1, 0, 0},
                {0, 0, 4, 0, 0, 8, 7, 0, 0},
                {0, 2, 0, 3, 0, 0, 9, 0, 0},
                {6, 0, 2, 0, 0, 3, 0, 4, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 5, 0, 6, 0, 0, 3, 0, 1},
                {0, 0, 3, 0, 0, 5, 0, 8, 0},
                {0, 0, 8, 2, 0, 0, 5, 0, 0},
                {0, 0, 9, 7, 0, 0, 0, 0, 0},
        };

        int lengthOfColumn = board.length;
        int widthOfRow = board[0].length;


        for (int row = 0; row < lengthOfColumn; row++) {
            for (int col = 0; col < widthOfRow; col++) {

                int input = 1;

                if (board[row][col] == 0) {
                    board[row][col] = input;

                    while (checkForDuplicatesInRow(board, col, row, input) || checkForDuplicatesInColumn(board, col, row, input)) {
                            input++;
                            board[row][col] = input;
                    }

                }
            }
        }

        System.out.println(Arrays.deepToString(board));
    }

    public static boolean checkForDuplicatesInRow(int[][] board, int col, int row, int input) {
        //column is always zero

        for (int j = 0; j < board[0].length; j++) {
            if (col != j) {
                if (board[row][j] == input) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkForDuplicatesInColumn(int[][] board, int col, int row, int input) {

        for (int j = 0; j < board.length; j++) {
            if (row != j) {
                if (board[j][col] == input) {
                    return true;
                }
            }
        }
        return false;
    }
}
