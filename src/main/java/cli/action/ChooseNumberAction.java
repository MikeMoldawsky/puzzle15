package cli.action;

import cli.menu.ChooseNumberMenu;
import game.BoardGame;
import io.bretty.console.view.ActionView;


public class ChooseNumberAction extends ActionView {
    private Integer numberChosen;
    private BoardGame puzzle;


    public ChooseNumberAction(BoardGame puzzle, Integer num) {
        super("The chosen number is: " + num, "Move number: " + num);
        this.puzzle = puzzle;
        this.numberChosen = num;
    }


    @Override
    public void executeCustomAction() {
        this.puzzle.moveNumberByValue(this.numberChosen);
        if(this.puzzle.isCompleted()){
            System.out.println("CONGRATS");
        } else{
            ChooseNumberMenu chooseNumberMenu = new ChooseNumberMenu(this.puzzle);
            chooseNumberMenu.display();
        }
    }


    @Override
    public void onQuit(){
        System.out.println("QUITINGFJASDJF");
        super.onQuit();
        Runtime.getRuntime().exit(0);
    }


    @Override
    public void onBack(){
        super.onBack();
    }
}