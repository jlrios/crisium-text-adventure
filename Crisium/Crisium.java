import java.util.Scanner;
import chapters.ChapterOne;
import game.Game;
import utilities.Utilities;

/**
 * Class: Crisium
 * Author: José L. Ríos
 * Creation date: 18/12/23
 * Short description:
 * Updates:
 */
public class Crisium {
    public static void gamePrompt() {
        ChapterOne chapterOne = new ChapterOne();
        Scanner readCommand = new Scanner(System.in);
        String command, commands;
        // Chapters, depending on whether it's a new game or a loaded game.
        // Task pending for later.
        chapterOne.partOne();
        commands = " Ingresa el comando [QUIT] para salir en cualquier momento del juego,\n"
                + " o el comando [SAVE] para salvar la partida actual.\n\n";
        System.out.print(commands);
        do {
            System.out.print(" >_ ");
            command = readCommand.nextLine();
        } while (!command.equalsIgnoreCase("QUIT"));
    }
    public static void main(String[] args) {
        Game game = new Game();
        Utilities utilities = new Utilities();
        Scanner readOption = new Scanner(System.in);
        String menuOption;
        boolean continueAdventure;
        utilities.clearScreen();
        game.showAbout();
        continueAdventure = game.continueYesNo();
        if (continueAdventure) {
            do {
                game.showMenu();
                menuOption = readOption.nextLine();
                switch (menuOption.toUpperCase()) {
                    case "I":
                        game.showIntro();
                        continueAdventure = game.continueYesNo();
                        if (continueAdventure) gamePrompt();
                        break;
                    case "S":
                        break;
                    default:
                        System.out.println(" Opción incorrecta.");
                        break;
                }

            } while(!menuOption.equalsIgnoreCase("S"));
        }
        utilities.typeWritter(" \n CRISIUM\n Aventura finalizada.\n\n");
    }
}