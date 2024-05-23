import Ui.Menu;
import Utils.InputHelper;
import Utils.WelcomeMessage;

public class Main {

    public static void main(String[] args) {
        WelcomeMessage.printWelcomeMessage();

        Menu menu = new Menu();
        menu.displayMenu();

InputHelper.close();


    }
}
