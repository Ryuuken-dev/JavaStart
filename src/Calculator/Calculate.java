package Calculator;

import java.util.Scanner;

public class Calculate {

    /*
    Napisz kalkulator dla liczb zmiennoprzecinkowych, który pozwala użytkownikowi kolejno na:

    wprowadzenie pierwszej liczby,
    wprowadzenie jednego z podstawowych działań matematycznych (plus, minus, podziel, pomnóż) - w postaci znaków +, -, /, *,
    wprowadzenie drugiej liczby.
    Po czym wyświetlony jest wynik odpowiedniego działania.

    W programie stwórz co najmniej dwie osobne klasy. W programie wykorzystaj instrukcję switch,
    nie możesz wykorzystywać instrukcji if-else.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Interface anInterface = new Interface();
        Calculator calculator = new Calculator();
        Controller controller = new Controller();

        System.out.println(anInterface.showInterface());
        System.out.println("Wybierz operację z listy (od 1 do 4): ");
        byte operation = scanner.nextByte();
        controller.validate(operation);
        System.out.println("Wpisz pierwszą liczbę: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Wpisz drugą liczbę: ");
        double secondNumber = scanner.nextDouble();
        UsersChoice usersChoice = new UsersChoice(firstNumber, secondNumber, operation);
        System.out.println(calculator.getResult(usersChoice));

    }
}
