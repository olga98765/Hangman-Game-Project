package Utils;

public class WelcomeMessage {

    public static void printWelcomeMessage() {
        String[] welcome = new String[] {
                " ____    __    ____  __       _______  __   _______  __       _______   ______ ",
                " \\   \\  /  \\  /   / |  |     /       ||  | |   ____||  |     |   ____| /      |",
                "  \\   \\/    \\/   /  |  |    |   (----`|  | |  |__   |  |     |  |__   |  ,----'",
                "   \\            /   |  |     \\   \\    |  | |   __|  |  |     |   __|  |  |     ",
                "    \\    /\\    /    |  |  ----)   |   |  | |  |____ |  `----.|  |____ |  `----.",
                "     \\__/  \\__/     |__| |_______/    |__| |_______||_______||_______| \\______|"
        };

        for (String line : welcome) {
            System.out.println(line);
        }
    }
}
