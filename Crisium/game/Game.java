package game;

import utilities.Utilities;
import java.util.Scanner;

/**
 * Class: Game
 * Author: José L. Ríos
 * Creation date: 30/01/24
 * Short description:
 * Updates:
 */
public class Game {
    Utilities utilities = new Utilities();
    public boolean continueYesNo() {
        Scanner readOption = new Scanner(System.in);
        String option;
        do {
            System.out.print(" ¿Deseas continuar (S/N)?: ");
            option = readOption.nextLine();
        } while (!option.equalsIgnoreCase("S") && !option.equalsIgnoreCase("N"));
        return option.equalsIgnoreCase("S");
    }
    public void showAbout() {
        String name, about;
        name = """
              ██████╗██████╗ ██╗███████╗██╗██╗   ██╗███╗   ███╗
             ██╔════╝██╔══██╗██║██╔════╝██║██║   ██║████╗ ████║
             ██║     ██████╔╝██║███████╗██║██║   ██║██╔████╔██║
             ██║     ██╔══██╗██║╚════██║██║██║   ██║██║╚██╔╝██║
             ╚██████╗██║  ██║██║███████║██║╚██████╔╝██║ ╚═╝ ██║
              ╚═════╝╚═╝  ╚═╝╚═╝╚══════╝╚═╝ ╚═════╝ ╚═╝     ╚═╝
                 █▓▒▒░░░ ¡BIENVENIDO A LA AVENTURA! ░░░▒▒▓█
            """;
        about = """
                 Ficción de texto interactiva
                 Derechos reservados 2024. José Ríos
                 Versión 1.0, serie: FXI-181223
                 Interprete estándar, versión 1.0
                """;
        System.out.println(name);
        utilities.typeWritter(about + "\n");
    }
    public void showIntro() {
        String intro, title;
        utilities.clearScreen();
        title = """
                 █▀█ █▀█ █▀▀ █▀▀ ▄▀█ █▀▀ █ █▀█
                 █▀▀ █▀▄ ██▄ █▀░ █▀█ █▄▄ █ █▄█
                """;
        intro = """
                Eres un Ingeniero de Software, y te encuentras solo en el Centro de Investigación Científica MX31-NERI,
                el cual, es una base lunar que se encuentra construida sobre y por debajo de la superficie del mare Crisium.
                La IA que controla todos los sistemas de la base, ha colapsado, comprometiendo así, todas las instalaciones.
                
                Tienes que restablecer los sistemas de la base, recuperar un código fuente que controla cierto procedimiento
                químico, para estabilizar un metal que posee propiedades energéticas superiores, recientemente descubierto en
                la Luna, escapar de allí y regresar a la Tierra, pero…, no será fácil.
            """;
        System.out.println(title);
        utilities.typeWritter(intro + "\n");
    }

    public void showMenu() {
        String menu;
        menu = """
                 Menú principal
                 Selecciona alguno de los siguientes comandos:
                 
                 A - [Obtener ayuda]
                 C - [Cargar partida]
                 I - [Iniciar nueva aventura]
                 O - [Opciones]
                 S - [Salir]
                """;
        System.out.println("\n" + menu);
        System.out.print(" Ingresa opción: ");
    }

    public void basicCommandsMenu() {
        String basicCommands, specials;
        basicCommands = " Opciones: \n"
            + " N - [IR AL NORTE]  S - [IR AL SUR]     Q - [SALIR]\n"
            + " E - [IR AL ESTE]   W - [IR AL OESTE]   S - [GUARDAR PARTIDA]\n";
        specials =" Especiales: \n [T] INGRESAR INSTRUCCIÓN EN TERMINAL\n";
        System.out.println(basicCommands);
        System.out.println(specials);
    }
}