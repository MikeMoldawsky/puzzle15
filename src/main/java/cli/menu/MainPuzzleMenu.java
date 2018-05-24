package cli.menu;

import cli.action.NewPuzzleAction;
import game.PuzzleGame;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;

public class MainPuzzleMenu extends MenuView {
    public MainPuzzleMenu(String runningTitle, String nameInParentMenu) {
        super(runningTitle, nameInParentMenu);
    }

    public MainPuzzleMenu(){
        super(PuzzleGame.title, "");
        this.addMenuItem(new NewPuzzleAction());
    }

    @Override
    public void onQuit(){
        super.onQuit();
        Runtime.getRuntime().exit(0);
    }
}
