package vansh.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N_Queen {

public boolean isSafe(int row,int col,char[][] board){
    for (int j = 0; j < board.length; j++) {
        if (board[row][j] == 'Q') {
            return false;
        }
    }


    for (int i = 0; i < board.length; i++) {
        if (board[i][col] == 'Q') {
            return false;
        }
    }


    int r = row;
    for (int c = col; c >= 0 && r >= 0; r--, c--) {
        if (board[r][c] == 'Q') {
            return false;
        }
    }


    r = row;
    for (int c = col; c >= 0 && r < board.length; r++, c--) {
        if (board[r][c] == 'Q') {
            return false;
        }
    }


    r = row;
    for (int c = col; c < board.length && r >= 0; r--, c++) {
        if (board[r][c] == 'Q') {
            return false;
        }
    }


    r = row;
    for (int c = col; c < board.length && r < board.length; r++, c++) {
        if (board[r][c] == 'Q') {
            return false;
        }
    }

    return true;
}

public void saveBoard(char[][] board,List<List<String>> allBoards){
    String row="";
    List<String> newBoard = new ArrayList<>();

    for(int i=0;i<board.length;i++){
        row="";
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]=='Q'){
                row+='Q';
            }else {
                row+='.';
            }
        }
        newBoard.add(row);
    }
    allBoards.add(newBoard);
}

public void helper(char[][] board,List<List<String>> allBoards, int col){
    if (col == board.length) {
        saveBoard(board, allBoards);
        return;
    }

    for (int row = 0; row < board.length; row++) {
        if (isSafe(row, col, board)) {
            board[row][col] = 'Q';
            helper(board, allBoards, col + 1);
            board[row][col] = '.';
        }
    }
}
public List<List<String>> solveNQueens(int n) {
    List<List<String>> allBoards = new ArrayList<>();
    char[][] board = new char[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            board[i][j] = '.';
        }
    }

    helper(board , allBoards, 0);
    return allBoards;
}
    public static void main(String[] args) {
        N_Queen solver = new N_Queen();
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number of Queens: ");
        int n = sc.nextInt();
        List<List<String>> solutions = solver.solveNQueens(n);

        System.out.println("Total solutions for " + n + "-Queens: " + solutions.size() + "\n");


        for (int i = 0; i < solutions.size(); i++) {
            System.out.println("Solution " + (i + 1) + ":");
            for (String row : solutions.get(i)) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
    }


