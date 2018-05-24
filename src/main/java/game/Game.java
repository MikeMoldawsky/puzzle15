package game;

public interface Game {
    String title = "Welcome To The Game";
    void start();
    void resume();

    void moveNumber(Integer numberChosen);

    boolean isCompleted();

    Integer[] getMovingNumbers();

    void draw();

}
