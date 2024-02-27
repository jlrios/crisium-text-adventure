package chapters;

import utilities.Utilities;

/**
 * Class:
 * Author: José L. Ríos
 * Creation date: 30/01/24
 * Short description:
 * Updates:
 */
public class ChapterOne {
    Utilities utilities = new Utilities();
    public void partOne() {
        String title, subTitle, text;
        title = """
                 █▀▀ ▄▀█ █▀█ █ ▀█▀ █░█ █░░ █▀█   ▄█
                 █▄▄ █▀█ █▀▀ █ ░█░ █▄█ █▄▄ █▄█   ░█
                """;
        subTitle = "   █▓▒▒░░░ MARE CRISIUM ░░░▒▒▓█";
        text = """
                    // UN CAOS ORDENADO //
                    
                    Haz recuperado el conocimiento, yaces en el piso y tu visión es un poco borrosa,
                    no recuerdas qué fue lo que pasó, ni sabes en donde te encuentras, después de unos
                    instantes, te incorporas lentamente, y tambaleante, caminas hasta la terminal que se
                    encuentra a un lado del elevador, es entonces cuando ubicas que te encuentras en el
                    el nivel 01 de la instalación A05 de la base.
                """;
        System.out.print("\n\n" + title);
        System.out.print(subTitle + "\n\n");
        utilities.typeWritter(text + "\n");
    }
}