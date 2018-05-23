import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;


class NewPuzzleAction extends ActionView {

    private Game puzzle = new Puzzle();
    private MenuView quitGameView = new MenuView("Game interrupted what would you like to do?", "");



    public NewPuzzleAction(){
        super("Starting Puzzle 15 New Game...", "Play New Puzzle 15");
        quitGameView.setParentView(this);
//        quitGameView.addMenuItem(new ResumePuzzleAction());
        quitGameView.addMenuItem(this);

    }

    @Override
    public void executeCustomAction() {

        Thread t = new Thread(){
            public void run(){
                System.out.println("ON the EXIT");
                quitGameView.display();
            }
        };

        Runtime.getRuntime().addShutdownHook(t);
//        Runtime.getRuntime().removeShutdownHook(t);

        this.puzzle.start();
        System.out.println("DONE");
    }

    @Override
    public void onQuit(){
        super.onQuit();
    }


    @Override
    public void onBack(){
        super.onBack();
    }
}