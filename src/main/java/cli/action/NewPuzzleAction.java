package cli.action;

import cli.menu.ChooseNumberMenu;
import game.Game;
import game.PuzzleGame;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;


public class NewPuzzleAction extends ActionView {
    private Game puzzle = new PuzzleGame();

    public NewPuzzleAction(){
        super("Starting new Puzzle 15 Game...", "Play Puzzle 15");
        this.puzzle.start(); // initializing new game - (random and more)
    }

    @Override
    public void executeCustomAction() {
//        this.puzzle.draw(); //TODO  change to matrix

        // Displaying Available numbers to move on the Board
        MenuView chooseNumberMenu = new ChooseNumberMenu(this.puzzle);
        //display available numbers to move
        chooseNumberMenu.display();

    }

    @Override
    public void onQuit(){
        System.out.println("QUITINGFJASDJF");
        super.onQuit();
        Runtime.getRuntime().exit(0);
    }

}