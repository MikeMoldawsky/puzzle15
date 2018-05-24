package game;

public interface BoardGame extends Game {
    String title = "Welcome To The Board Game";
    void moveNumberByValue(Integer numberChosen);
    Integer[] getMovingNumbersValues();
}
