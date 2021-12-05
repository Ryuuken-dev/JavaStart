package Exercises;

import java.util.Random;
import java.util.Scanner;

public class General {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        /*
    Napisz program, który pobierze liczbę reprezentującą wiek użytkownika w latach (liczba
    całkowita), a następnie wyświetli czy jest on pełnoletni czy nie.
     */
//        System.out.println(userAge(scanner));           //solution

        /*
    Napisz program który pobierze od użytkownika liczbę całkowitą i: a) wyświetli informację czy
    jest ona dodatnia, ujemna czy równa zero, b) wyświetli również informację czy jest ona
    parzysta czy nieparzysta.
         */
//        System.out.println(getNumber(scanner));         //solution

        /*
    Zrób grę w zgadywanie, w której program losuje liczbę od 1 do 10, a gracz ma 2 próby aby
    zgadnąć liczbę. W przypadku każdej odpowiedzi gracz dostaje informację zwrotną: za
    wysoko/za nisko/trafiona. DODATKOWO: Ulepsz grę aby pytała tylko raz jeśli od razu trafisz
    i mówiła dodatkowo: “gorąco!” jeśli byłeś blisko oraz “zimno…” jeśli byłeś daleko.
         */
        guessGame(scanner, random);


    }

    public static String userAge(Scanner user){
        System.out.println("Podaj wiek: ");
        byte age = user.nextByte();
        if (age >= 18){
            return "Jesteś pełnoletni";
        }
        return "Jesteś niepełnoletni";
    }

    public static StringBuilder getNumber(Scanner user){
        System.out.println("Podaj liczbę całkowitą: ");
        int choice = user.nextInt();
        StringBuilder result = new StringBuilder();
        if (choice % 2 == 0){
            result.append("Liczba jest parzysta." + '\n');
        } else {
            result.append("Liczba jest nieparzysta." + '\n');
        }
        if (choice > 0){
            result.append("Liczba jest dodatnia.");
        } else if (choice == 0){
            result.append("Liczba jest równa zero.");
        } else{
            result.append("Liczba jest ujemna.");
        }
        return result;
    }

    public static void guessGame(Scanner user, Random random){
        for (byte i = 0; i < 2; i++){
            byte computersNumber = (byte) ((byte) random.nextInt(11) + 1);
            System.out.println(computersNumber);
            System.out.println("Podaj liczbę od 1 do 10: ");
            byte usersChoice = user.nextByte();
            if (usersChoice == computersNumber){
                System.out.println("Trafiona!");
                return;
            } else {
                if (usersChoice >= computersNumber-2){
                    System.out.println("Gorąco!");
                } else {
                    System.out.println("Zimno!");
                }
            }
            if (usersChoice > computersNumber){
                System.out.println("Za wysoko");
            } else {
                System.out.println("Za nisko");
            }
        }

    }
}
