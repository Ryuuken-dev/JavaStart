package Calculator;

public class Calculate {

    /*
    Napisz program-kalkulator operujący na liczbach zmiennoprzecinkowych typu double,
    który będzie składał się z dwóch klas w osobnych plikach:

    Calculator.java - Klasa tu zdefiniowana powinna zawierać metody add(), subtract(), multiply(), divide(), czyli
    kolejno dodawanie, odejmowanie, mnożenie i dzielenie. Zastanów się jakie argumenty powinny przyjmować oraz wartość
    jakiego typu powinny zwracać
    Calculate.java - tutaj umieść klasę testową z metodą main().
    Zadeklaruj i zainicjuj w niej co najmniej 2 zmienne typu double, utwórz obiekt klasy Calculator i za jego pomocą
    oblicz wynik różnych działań matematycznych.
    Wszystkie wyniki działań wyświetl na ekranie.
     */

    public static void main(String[] args) {
        double x = 10;
        double y = 23;
        Calculator calculator = new Calculator();
        System.out.println("A= " + x + " B= " + y);
        System.out.println("A+B= " + calculator.add(x, y));
        System.out.println("A-B= " + calculator.subtract(x, y));
        System.out.println("A*B= " + calculator.multiply(x, y));
        System.out.println("A/B= " + calculator.divide(x, y));
    }
}
