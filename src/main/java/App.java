import io.bretty.console.view.MenuView;

public class App {
    static public void main(String[] args) {

        Game puzzle = new Puzzle();
//        Runtime.getRuntime().addShutdownHook(new Thread(){
//            public void run(){
//                System.out.println("EXIT");
//            }
//        });
//        while(true){}
//    }
        MenuView rootMenu = new MenuView("Welcome...", "");

//         register menu items
        rootMenu.addMenuItem(new BookTaxiAction());
        rootMenu.display();
    }
}
