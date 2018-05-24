package cli.menu;

import cli.action.ChooseNumberAction;
import game.BoardGame;
import io.bretty.console.view.MenuView;

public class ChooseNumberMenu extends MenuView {

    public ChooseNumberMenu(BoardGame puzzle){
        super("Choose the number you would like to move:", "");
        puzzle.draw();
        Integer[] movingNumbers = puzzle.getMovingNumbers();
        for (Integer num: movingNumbers) {
            // passing moveNumberMenu in order to enable the user to change number chosen
            this.addMenuItem(new ChooseNumberAction(puzzle, num));
        }
    }

    @Override
    public void onQuit(){
        super.onQuit();
        Runtime.getRuntime().exit(0);
    }
}
