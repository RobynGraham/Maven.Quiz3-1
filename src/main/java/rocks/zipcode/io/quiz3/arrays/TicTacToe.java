package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe { //class Tic Tac Toe


    private final String[][] board; // initialize board

    public TicTacToe(String[][] board) { //board constructor, create instance of board

        this.board = board;
    }

    public TicTacToe() { //constructor
        this(new String[3][3]);
    }

    public String[] getRow(Integer value) {//method to return row array

        return board[value];
    }

    public String[] getColumn(Integer columnIndex) {//method to return column array,
        String firstElement = board[0][columnIndex];
        String secondElement = board[1][columnIndex];
        String thirdElement = board[2][columnIndex];

        String[] column = {firstElement, secondElement, thirdElement};

        return column;

    }

    public Boolean isRowHomogenous(Integer rowIndex) {//method to return if all values in the row are the same

        return isHomogenous(getRow(rowIndex));

    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {//method to return true if all values in the column are the same

            return isHomogenous(getColumn(columnIndex));
        }



    public String getWinner() { //method to return row, column or diagonal of the board
        String topLeft = board[0][0];
        String middle = board[1][1];
        String bottomRight = board[2][2];
        String[] backSlashDiagnol = {topLeft, middle, bottomRight};

        String topRight = board[0][2];
        String bottomLeft = board[2][0];
        String[] forwardSlashDiagnol = {topRight, middle, bottomLeft};

        for (int i = 0; i < 2; i++) {
            if(isColumnHomogeneous(i)) {
                return getColumn(i)[0];
            }
            if(isRowHomogenous(i)) {
                return getRow(i)[0];
            }
        }
        if(isHomogenous(backSlashDiagnol)) {
            return backSlashDiagnol[0];
        }
        if(isHomogenous(forwardSlashDiagnol)) {
            return forwardSlashDiagnol[0];
        }
        return null;

    }
        private boolean isHomogenous(String[] array) {
        List<String> columnList = Arrays.asList(array);
        Set<String> columnSet = new HashSet<>(columnList);
            return columnSet.size() == 1;
    }

        public String[][] getBoard() {//method to return the board

        return board;
    }

}
