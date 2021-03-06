package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PuzzleBoardGame implements BoardGame {
    static public String title = "Welcome to The game - Puzzle 15";
    static private int blankNumber = 16;
    static private int size = 4;

    private int[][] board;
    // Board empty square indexes
    private int blankRow = 3;
    private int blankCol = 3;

    public PuzzleBoardGame(){
        this.board = getRandomBoard();
    }

    private int[][] getRandomBoard(){
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i < size*size; i++){
            numbers.add(i);
        }
        // Shuffling the Board
        do {
            Collections.shuffle(numbers);
        } while(!isShuffled(numbers));

        int[][] board = new int[size][size];
        for(int i = 0; i < numbers.size(); i++){
            board[i/size][i%size] = numbers.get(i);
        }

        //Setting right most down corner with the Blank number
        board[blankRow][blankCol] = blankNumber;
        return board;
    }

    private boolean isShuffled(List<Integer> numbers) {
        Integer prev = null;
        for (Integer cur: numbers) {
            if(prev != null && prev + 1 != cur) return true;
            prev = cur;
        }
        return false;
    }

    public void moveNumberByValue(Integer numberChosen) {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                if (numberChosen == this.board[i][j]){
                    this.swapNumberWithBlank(i,j);
                    return;
                }
            }
        }
    }

    private void swapNumberWithBlank(int i, int j) {
        this.board[this.blankRow][this.blankCol] = this.board[i][j];
        this.board[i][j] = blankNumber;
        this.blankRow = i;
        this.blankCol = j;
    }

    public boolean isCompleted() {
        Integer prev = null;
        for (int[] row : this.board) {
            for (int cur : row) {
                if (prev != null && cur != prev + 1) return false;
                prev = cur;
            }
        }
        return true;
    }

    public Integer[] getMovingNumbersValues() {
        List<Integer> numbers = new ArrayList<Integer>();
        if(this.blankRow - 1 >= 0) numbers.add(this.board[this.blankRow-1][this.blankCol]); //up Of blank
        if(this.blankRow  + 1 < size) numbers.add(this.board[this.blankRow+1][this.blankCol]); //down Of blank
        if(this.blankCol  - 1 >= 0) numbers.add(this.board[this.blankRow][this.blankCol-1]); //left Of blank
        if(this.blankCol  + 1 < size) numbers.add(this.board[this.blankRow][this.blankCol+1]); //right Of blank
        return numbers.toArray(new Integer[numbers.size()]);
    }

    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : this.board) {
            for (int number : row) {
                String square;
                if (number == blankNumber) { // made 16 as the empty square
                    square = "|    ";
                } else if (number < 10) {
                    square = "|  " + number + " ";
                } else {
                    square = "| " + number + " ";
                }
                sb.append(square);
            }
            sb.append(" |\n");
        }
        return sb.toString();
    }
}
