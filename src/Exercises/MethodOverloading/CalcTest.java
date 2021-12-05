package Exercises.MethodOverloading;

public class CalcTest {

    /*
    Napisz program - kalkulator, który będzie składał się z dwóch klas:

    Calculator,
    CalcTest.
    W klasie Calculator zdefiniuj metody add (dodaj) i subtract (odejmij) w kilku przeciążonych wersjach, aby mogły
    dodawać lub odejmować 2 lub 3 liczby (a+b+c lub a-b-c) wybranego przez Ciebie typu liczbowego.

    W klasie CalcTest przetestuj działanie klasy Calculator.
     */

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double number1 = 46;
        double number2 = 24;
        double number3 = -12;
        System.out.println("A = " + number1 + " B = " + number2 + " C = " + number3);
        System.out.println("A+B = " + calculator.add(number1, number2));
        System.out.println("A+B+C = " + calculator.add(number1, number2, number3) + '\n');
        System.out.println("A-B = " + calculator.subtract(number1, number2));
        System.out.println("A-B-C = " + calculator.subtract(number1, number2, number3));
    }
}
