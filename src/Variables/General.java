package Variables;

import java.util.Random;

public class General {



    public static void main(String[] args) {
        carData();
        numbersResults();
    }

    /*
    Exercise 1
    Napisz program, w którym zadeklarujesz zmienne, które będą reprezentować samochód w salonie samochodowym poprzez:

    Markę
    Model
    Rocznik
    Cenę

    Możesz również dodać dowolne zmienne, które samodzielnie uznasz za stosowne. Do reprezentacji każdego z powyższych
    elementów wykorzystaj najbardziej odpowiedni Twoim zdaniem typ danych.

    Na końcu wyświetl informacje o samochodzie, które przypisałeś do zmiennych.
     */


    public static void carData() {
        String brand = "Opel";
        String model = "Astra";
        int productionYear = 1997;
        int price = 2000;

        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + productionYear);
        System.out.println("Cena: " + price);
    }



    /*
    Exercise 2
    Napisz program, w którym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich dowolne liczby,
    a następnie za pomocą operatorów logicznych i matematycznych wyświetl wynik następujących zdań logicznych:

    Czy x jest większe od y?
    Czy x pomnożone przez 2 jest większe od y?
    Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
    Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)
    Wynik każdego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.

    W zadaniu możesz wykorzystać losowanie liczb. W podpowiedzi znajdziesz sposób jak to zrobić, ale zachęcam Cię
    najpierw do skorzystania z Google. Umiejętność sprawnego korzystania z wyszukiwarki internetowej to też ważna
    umiejętność każdego programisty.
     */

    public static void numbersResults(){
        Random generator = new Random();
        int x = generator.nextInt(101) + 1;
        int y = generator.nextInt(101) + 1;
        System.out.println(x);
        System.out.println(y);

        boolean result = x > y;
        System.out.println("x > y = " + result);
        result = x*2>y;
        System.out.println("x * 2 > y = " + result);
        result = y < x + 3 && y > x - 2;
        System.out.println("(y < x + 3) && (y > x - 2) = " + result);
        result = (x * y) % 2 == 0;
        System.out.println("Czy x*y jest parzyste? " + result);


    }




}
