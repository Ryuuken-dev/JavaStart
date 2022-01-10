package WhileLoops;

import java.util.Scanner;

public class General {

    public static void main(String[] args) {

        /*
        Napisz program, który najpierw pobiera od użytkownika liczbę mówiącą o tym ile liczb chce wprowadzić.
        Następnie pobierz od niego tyle liczb ile zadeklarował, zsumuj je i wyświetl na ekranie wynik.
        Nie używaj tablic.
         */

        double summary = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz zsumować:");
        int howManyNumbers = scanner.nextInt();

        do {
            System.out.println("Podaj liczbę: ");
            double number = scanner.nextDouble();
            summary += number;
            howManyNumbers--;
        } while (howManyNumbers > 0);
        System.out.println("Suma wprowadzonych liczb wynosi " + summary);
    }
}
