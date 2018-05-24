package game;

public class PuzzleGame implements Game {

    static public String title = "Welcome to The game - Puzzle 15";


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
        System.out.println("IM DRAWING\n#####################\n#####################\n#####################\n");

    }

}
