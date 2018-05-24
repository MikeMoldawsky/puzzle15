package cli.action;

import cli.menu.ResumePuzzleMenu;
import game.Game;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;


class ResumePuzzleAction extends ActionView {

    private Game game;
    private MenuView resumePuzzleMenu = new ResumePuzzleMenu();

    public ResumePuzzleAction(Game game){
        super("Continuing game.PuzzleGame 15 game.Game...", "Resume");
        this.setParentView(resumePuzzleMenu);
        this.game = game;
    }

    @Override
    public void executeCustomAction() {
        Thread t = new Thread(){
            public void run(){
                System.out.println("ON the EXIT");
                resumePuzzleMenu.display();
            }
        };

        Runtime.getRuntime().addShutdownHook(t);

        game.resume();
    }
}