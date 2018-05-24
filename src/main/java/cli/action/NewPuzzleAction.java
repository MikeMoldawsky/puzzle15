package cli.action;

import cli.menu.ChooseNumberMenu;
import game.BoardGame;
import game.PuzzleBoardGame;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;


public class NewPuzzleAction extends ActionView {
    private BoardGame puzzle = new PuzzleBoardGame();

    public NewPuzzleAction(){
        super("Starting new Puzzle 15 BoardGame...\n\nBe carfule In Every step Quit command will exit the entire game - Good Luck.\n", "Play Puzzle 15");
    }

    @Override
    public void executeCustomAction() {
        // Displaying Available numbers to move on the Board
        MenuView chooseNumberMenu = new ChooseNumberMenu(this.puzzle);
        //display available numbers to move
        chooseNumberMenu.display();
    }

}