package cli.action;

import cli.menu.MoveNumberMenu;
import cli.menu.ResumePuzzleMenu;
import game.Game;
import game.PuzzleGame;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;


public class NewPuzzleAction extends ActionView {
    private Game puzzle = new PuzzleGame();
    private MenuView mainMenu;



    public NewPuzzleAction(MenuView mainMenu){
        super("Starting new Puzzle 15 Game...", "Play Puzzle 15 Game");
        this.mainMenu = mainMenu;
        this.move
        this.setParentView(mainMenu);
    }

    @Override
    public void executeCustomAction() {
        this.puzzle.start();
        while (!puzzle.isCompleted()){
            MenuView moveNumberMenu = new MoveNumberMenu();
            moveNumberMenu.setParentView(mainMenu);

            this.puzzle.draw(); //TODO  change to matrix

            Integer[] movingNumbers = this.puzzle.getMovingNumbers();
            for (Integer num: movingNumbers) {
                moveNumberMenu.addMenuItem(new MoveNumberAction(moveNumberMenu, num));
            }
            moveNumberMenu.display();
        }
        System.out.println("DONE");
    }

    @Override
    public void onQuit(){
        System.out.println("QUITINGFJASDJF");
        super.onQuit();
        Runtime.getRuntime().exit(0);
    }

}