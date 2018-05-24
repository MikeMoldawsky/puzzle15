package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PuzzleGame implements Game {

    static public String title = "Welcome to The game - Puzzle 15";
    private int size = 4;
    private int[][] board;
    public PuzzleGame(){
        this.board = getRandomBoard();
    }

    private int[][] getRandomBoard(){
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i < this.size*this.size; i++){
            numbers.add(i);
        }

        do {
            Collections.shuffle(numbers);
        } while(!isShuffled(numbers));

        int[][] board = new int[this.size][this.size];
        for(int i = 0; i < numbers.size(); i++){
            board[i/4][i%4] = numbers.get(i);
        }
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

    public void start() {
        System.out.println("Starting....");

    }

    public void resume() {
        System.out.println("Resuiming....");

    }

    public void moveNumber(Integer numberChosen) {
        System.out.println("moving a number....");
    }

    public boolean isCompleted() {
        return false;
    }

    public Integer[] getMovingNumbers() {
        return new Integer[] {1,2,3,4};
    }

    public void draw() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                int number = this.board[i][j];
                String square = null;
                if (number == 0){ // make 0 as the empty board
                    square = "|    ";
                } else if (number < 10){
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
