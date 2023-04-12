package LeetcodeAlgorithmBuilding;

import java.util.Arrays;

public class FillBoardWithChar {
    private static char [][] board= {{'X','O','X'}, {'O', 'O', 'X'},{'X', 'O','O'}};

    public static void main(String[] args) {
        fillBoard(1);
    }

    public static void fillBoard(int number){
            for (int row = 0; row <board.length ; row++) {
                for (int column = 0; column <board.length ; column++) {
                    if (number==0 && board[row][column]=='X'){
                    board[row][column] = '1';}
                    if (number==1 && board[row][column]=='O'){
                        board[row][column] = '1';}
            }
        }
        for (char [] row: board) {
            System.out.println(Arrays.toString(row));
        }
    }
}

