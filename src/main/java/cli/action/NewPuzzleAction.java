package cli.action;

import cli.menu.ResumePuzzleMenu;
import game.Game;
import game.PuzzleGame;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;


public class NewPuzzleAction extends ActionView {


    private Game puzzle = new PuzzleGame();
    private MenuView quitGameMenu = new ResumePuzzleMenu();


    public NewPuzzleAction(MenuView mainMenu){
        super("Starting new Puzzle 15 Game...", "Play New Puzzle 15 Game");
//        quitGameMenu.addMenuItem(new ResumePuzzleAction());
        this.setParentView(mainMenu);
        quitGameMenu.addMenuItem(new ResumePuzzleAction(puzzle));

    }

    @Override
    public void executeCustomAction() {

        Thread t = new Thread(){
            public void run(){
                System.out.println("ON the EXIT");
                quitGameMenu.display();
            }
        };

        Runtime.getRuntime().addShutdownHook(t);
//        Runtime.getRuntime().removeShutdownHook(t);

            this.puzzle.start();
        System.out.println("DONE");
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