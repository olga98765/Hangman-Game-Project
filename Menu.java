
public class Menu {

    public void displayMenu() {
        boolean running = true;

        while (running) {

            System.out.println(
                    "\nWybierz opcję\n\n1.Graj\n2. Dodaj słowo\n3. Usuń słowo\n4. Edytuj słowo\n5. Pokaż statystyki\n6. Pokaż słowa w grze\n7. Wyjdź\n");

            String option = InputHelper.readLine();

            switch (option) {
                case "1":

                    Options.playGame();
                    break;
                case "2":

                    Options.addWord();
                    break;
                case "3":

                    Options.removeWord();
                    break;
                case "4":

                    Options.editWordByNumber();
                    break;
                case "5":

                    Options.showStatistics();
                    break;
                case "6":

                    Options.showWordDatabase();
                    break;
                case "7":
                    System.out.println("7");

                    running = false;
                    break;
                default:
                    System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
                    break;
            }

        }

    }

}
