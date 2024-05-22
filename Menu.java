import java.util.Scanner;

public class Menu {


public void displayMenu() {

System.out.println("\nWybierz opcję\n\n1.Graj\n2. Dodaj słowo\n3. Usuń słowo\n4. Edytuj słowo\n5. Pokaż statystyki\n6. Pokaż słowa w grze\n7. Wyjdź\n");

String option = InputHelper.readLine();

switch (option) {
    case "1":

    System.out.println("1");
        // playGame();
        break;
    case "2":
    System.out.println("2");

        // addWord();
        break;
    case "3":
    System.out.println("3");

        // removeWord();
        break;
    case "4":
    System.out.println("4");

        // editWordByNumber();
        break;
    case "5":
    System.out.println("5");

        // showStatistics();
        break;
    case "6":
    System.out.println("6");

        // showWordDatabase();
        break;
    case "7":
    System.out.println("7");

        // close();
        break;
    default:
        System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
        break;
}














}



}
