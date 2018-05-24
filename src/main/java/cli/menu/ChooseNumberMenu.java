package cli.menu;

import cli.action.ChooseNumberAction;
import cli.action.NewPuzzleAction;
import game.Game;
import game.PuzzleGame;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;

public class ChooseNumberMenu extends MenuView {

    public ChooseNumberMenu(Game puzzle){
        super("Choose the number you would like to move", "");
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
