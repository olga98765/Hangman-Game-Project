import java.util.Scanner;

public class InputHelper {


    static Scanner scanner = new Scanner(System.in);


public static String readLine() {
    return scanner.nextLine();
}

public static void close() {
    scanner.close();
}


}
