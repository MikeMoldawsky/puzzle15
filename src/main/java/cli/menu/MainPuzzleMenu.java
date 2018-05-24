package cli.menu;

import cli.action.NewPuzzleAction;
import game.PuzzleBoardGame;
import io.bretty.console.view.MenuView;

public class MainPuzzleMenu extends MenuView {
    public static void startNewGame(){
        MenuView rootMenu = new MainPuzzleMenu();
        rootMenu.display();
    }

    private MainPuzzleMenu(){
        super(PuzzleBoardGame.title, "");
        this.addMenuItem(new NewPuzzleAction());
    }

    @Override
    public void onQuit(){
        super.onQuit();
        Runtime.getRuntime().exit(0);
    }
}
