package cli.action;

import cli.menu.ResumePuzzleMenu;
import game.Game;
import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;


class ResumePuzzleAction extends ActionView {

    private Game game;

    public ResumePuzzleAction(Game game){
        super("Resuming Puzzle 15 Game...", "Resume");
        this.game = game;
    }

    @Override
    public void executeCustomAction() {
        Thread t = new Thread(){
            public void run(){
                System.out.println("ON the EXIT");
                boolean confirmed = this.confirmDialog("Make booking now?");
                if(confirmed){
                    this.println("Your taxi is on the way!");
                }
            }
        };

        Runtime.getRuntime().addShutdownHook(t);

        game.resume();
    }
}