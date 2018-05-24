package cli.menu;

import io.bretty.console.view.MenuView;

public class ResumePuzzleMenu extends MenuView {
    public ResumePuzzleMenu(String runningTitle, String nameInParentMenu) {
        super(runningTitle, nameInParentMenu);
    }

    public ResumePuzzleMenu(){
        this("BoardGame interrupted what would you like to do?", "");
    }

    @Override
    public void onQuit(){
        super.onQuit();
        Runtime.getRuntime().exit(0);
    }
}
