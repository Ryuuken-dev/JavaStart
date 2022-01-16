package Algorithmics;

import java.util.Scanner;

public class General {

    public static void main(String[] args) {
        /*
        Napisz program, który będzie wczytywał od użytkownika kolejne liczby całkowite. Wczytywanie liczb powinno
        zakończyć się w momencie, gdy użytkownik poda liczbę większą od 100.  Jeżeli suma wszystkich wprowadzonych liczb
        mniejszych bądź równych 100 jest liczbą parzystą, to wyświetl komunikat "parzysta", a jeżeli nie to "nieparzysta"

        Rozwiązanie problemu rozpocznij od narysowania schematu blokowego dla opisanego algorytmu.
         */

        int sum = getSum();
        printOddOrEven(sum);


    }

    public static int getSum(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        while (number <= 100) {
            System.out.println("Podaj liczbę: ");
            number = scanner.nextInt();
            if (number > 100){
                break;
            }
            sum += number;
        }
        return sum;
    }

    public static void printOddOrEven(int sum){
        if (sum % 2 == 0){
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }
}
