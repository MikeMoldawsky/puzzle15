import cli.menu.MainPuzzleMenu;
import io.bretty.console.view.MenuView;

public class App {
    static public void main(String[] args) {
        MenuView rootMenu = new MainPuzzleMenu();
        rootMenu.display();
    }
}
