import io.bretty.console.view.MenuView;

public class App {
    static public void main(String[] args) {

        MenuView rootMenu = new MenuView(Puzzle.title, "");
        rootMenu.addMenuItem(new NewPuzzleAction());
        rootMenu.display();
    }
}
