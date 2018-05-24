package cli.action;

import cli.menu.ResumePuzzleMenu;
import game.Game;
import game.PuzzleGame;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;


public class MoveNumberAction extends ActionView {
    private Game puzzle;
    Integer numberChosen;


    public MoveNumberAction(Game puzzle, Integer num) {
        super("Where should we move number" + num, "Move number " + num);
        this.puzzle = puzzle;
        this.numberChosen = num;
    }

    @Override
    public void executeCustomAction() {
        String[] directions = puzzle.getMovingDirections();
        for (String dir: directions ) {


        }

    }

    @Override
    public void onQuit(){
        System.out.println("QUITINGFJASDJF");
        super.onQuit();
        Runtime.getRuntime().exit(0);
    }

}