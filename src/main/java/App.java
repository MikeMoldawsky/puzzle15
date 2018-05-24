import cli.menu.MainPuzzleMenu;
import game.PuzzleGame;
import io.bretty.console.view.MenuView;

public class App {
    static public void main(String[] args) {
        MenuView rootMenu = new MainPuzzleMenu();
        rootMenu.display();
    }
}
