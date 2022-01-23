package Enum;

import java.util.Scanner;

public class Pizzeria {

    /*
    Napisz aplikację, która będzie symulowała pizzerię. Stwórz dwa typy:

    Z definicją typu enum o nazwie Pizza, który może przyjmować wartość MARGHERITA (sos pomidorowy + ser), CAPRICIOSA
    (sos pomidorowy + ser + pieczarki) lub PROSCIUTTO (sos pomidorowy + ser + szynka). Typ Pizza powinien przechowywać
    informacje o każdym składniku osobno, pozwalać odczytać informację o każdym składniku. Nadpisz metodę toString(),
    aby wygodnie wyświetlić informacje o danej pizzy.
    Klasę Pizzeria, w której wyświetlisz użytkownikowi możliwe do wyboru pizze, wczytasz od niego tę pizzę, którą chce,
    a na końcu potwierdzisz zamówienie.
    Wykorzystaj w programie jak najwięcej funkcjonalności jakie daje wykorzystanie typu enum.
     */

    public static void main(String[] args) {

        System.out.println("Dostępne pizze: ");
        Pizza[] pizzas = Pizza.values();
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz pizzę:");
        Pizza pizza = Pizza.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Dziękujemy za zamówienie " + pizza.name());
    }
}
