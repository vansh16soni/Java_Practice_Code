package vansh.dsa;

public class Sudoku {
    public boolean isSafe(char[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (num + '0')) {
                return false;
            }
        }

        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == (char) (num + '0')) {
                return false;
            }
        }

        int startrow = 3 * (row / 3);
        int startcol = 3 * (col / 3);
        for (int i = startrow; i < startrow + 3; i++) {
            for (int j = startcol; j < startcol + 3; j++) {
                if (board[i][j] == (char) (num + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int newrow = 0;
        int newcol = 0;

        if (col == board.length - 1) {
            newrow = row + 1;
            newcol = 0;
        } else {
            newrow = row;
            newcol = col + 1;
        }

        if (board[row][col] != '.') {
            return helper(board, newrow, newcol);
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = (char) (i + '0');

                if (helper(board, newrow, newcol)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }


    public static void printBoard(char[][] board) {
        String horizontalBorder = "+-------+-------+-------+";

        for (int i = 0; i < board.length; i++) {

            if (i % 3 == 0) {
                System.out.println(horizontalBorder);
            }

            for (int j = 0; j < board[0].length; j++) {

                if (j % 3 == 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }

            System.out.println("|");
        }

        System.out.println(horizontalBorder);
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Sudoku solver = new Sudoku();
        System.out.println("Original Sudoku:");
        printBoard(board);

        solver.solveSudoku(board);

        System.out.println("\nSolved Sudoku:");
        printBoard(board);
    }
}