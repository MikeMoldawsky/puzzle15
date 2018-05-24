package game;

public interface BoardGame {
    String title = "Welcome To The BoardGame";
    void draw();
    boolean isCompleted();

    void moveNumber(Integer numberChosen);
    Integer[] getMovingNumbers();


}
