package utilities;

/**
 * Class:
 * Author: José L. Ríos
 * Creation date: 30/01/24
 * Short description:
 * Updates:
 */
public class Utilities {
    public void clearScreen() {
        System.out.println("\033[2J");
        System.out.println("\033[1H");
    }

    public void typeWritter(String text) {
        char[] characters = text.toCharArray();
        for (char c: characters) {
            System.out.print(c);
            try {
                Thread.sleep(45);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}