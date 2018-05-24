package cli.action;

import cli.menu.ChooseNumberMenu;
import game.Game;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;


public class ChooseNumberAction extends ActionView {
    private Integer numberChosen;
    private Game puzzle;


    public ChooseNumberAction(Game puzzle, Integer num) {
        super("The chosen number is: " + num, "Move number: " + num);
        this.puzzle = puzzle;
        this.numberChosen = num;
    }


    @Override
    public void executeCustomAction() {
        this.puzzle.moveNumber(this.numberChosen);
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