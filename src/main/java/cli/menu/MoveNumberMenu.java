package cli.menu;

import cli.action.NewPuzzleAction;
import game.PuzzleGame;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;

public class MoveNumberMenu extends MenuView {
    public MoveNumberMenu(String runningTitle, String nameInParentMenu) {
        super(runningTitle, nameInParentMenu);
    }

    public MoveNumberMenu(){
        super(PuzzleGame.title, "");
        ActionView newPuzzleAction = new NewPuzzleAction(this);
        this.addMenuItem(newPuzzleAction);
    }

    @Override
    public void onQuit(){
        super.onQuit();
        Runtime.getRuntime().exit(0);
    }
}
