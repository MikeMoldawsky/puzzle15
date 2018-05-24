package cli.action;

import cli.menu.ChooseNumberMenu;
import game.BoardGame;
import io.bretty.console.view.ActionView;

public class ChooseNumberAction extends ActionView {
    private Integer numberChosen;
    private BoardGame puzzle;


    public ChooseNumberAction(BoardGame puzzle, Integer num) {
        super("You Chose To Move number: " + num + "\n", "Move number: " + num);
        this.puzzle = puzzle;
        this.numberChosen = num;
    }


    @Override
    public void executeCustomAction() {
        this.puzzle.moveNumberByValue(this.numberChosen);
        if(this.puzzle.isCompleted()){
            System.out.println("#######################\nGOOD JOB - YOU MADE IT\n#######################\n");
            Runtime.getRuntime().exit(0);
        } else{
            ChooseNumberMenu chooseNumberMenu = new ChooseNumberMenu(this.puzzle);
            chooseNumberMenu.display();
        }
    }

}