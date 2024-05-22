import java.util.Scanner;

public class Menu {


public void displayMenu() {

System.out.println("\nWybierz opcję\n\n1.Graj\n2. Dodaj słowo\n3. Usuń słowo\n4. Edytuj słowo\n5. Pokaż statystyki\n6. Pokaż słowa w grze\n7. Wyjdź\n");



switch () {
    case "1":
        playGame();
        break;
    case "2":
        addWord();
        break;
    case "3":
        removeWord();
        break;
    case "4":
        editWordByNumber();
        break;
    case "5":
        showStatistics();
        break;
    case "6":
        showWordDatabase();
        break;
    case "7":
        close();
        break;
    default:
        System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
        break;
}














}



}
