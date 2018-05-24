import cli.menu.MainPuzzleMenu;
import game.Game;
import game.PuzzleGame;
import io.bretty.console.view.MenuView;

public class App {
    static public void main(String[] args) {
//        MenuView rootMenu = new MainPuzzleMenu();
//        rootMenu.display();
        int i = 0;
        while(i++ < 5) {
            Game p = new PuzzleGame();

            p.draw();
        }
    }
}
