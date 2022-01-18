package Inheritance;

public class General {

    /*
    Stwórz projekt, w którym wykorzystując dziedziczenie stworzysz prostą hierarchię klas odwzorowujących części w
    hurtowni motoryzacyjnej zgodnie z poniższą specyfikacją:

    * Każda część w hurtowni (Part) posiada swój unikalny numer identyfikacyjny, przechowuje nazwę producenta,
      model i serię produktu.
    * Opony (Tire) posiadają dodatkowo informację o rozmiarze i szerokości.
    * Części układu wydechowego (ExhaustPart) posiadają dodatkową informację, czy jest ona zgodna z europejskim
      standardem emisji spalin.

    Dopisz krótką klasę testową, w której utworzysz kilka obiektów reprezentujących części i wyświetl informacje o nich.

    Początkowo klasy mogą mieć pola publiczne, później dostosuj je do konwencji JavaBeans.
     */

    public static void main(String[] args) {

        Tire michelin = new Tire(1, "Michelin", "DA-21", "DA", 15, 65);
        michelin.printInfo();
        Muffler polman = new Muffler(2, "POL-MAN", "PM-1", "PM",
                true, "middle", "aluminium");
        polman.printInfo();
    }
}
