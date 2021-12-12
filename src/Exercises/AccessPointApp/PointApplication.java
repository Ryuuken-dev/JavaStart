package Exercises.AccessPointApp;

import Exercises.AccessPointApp.controller.PointController;
import Exercises.AccessPointApp.data.Point;

class PointApplication {

    public static void main(String[] args) {

        /*
        Napisz program, który pozwala na kontrolowanie danych obiektu, który reprezentuje punkt na płaszczyźnie.

        Punkt reprezentowany przez klasę Point powinien zawierać dwa pola reprezentujące współrzędną X oraz Y.
        Reprezentacja współrzędnych powinna być całkowitoliczbowa. Klasa powinna być zgodna ze specyfikacją JavaBeans.
        Klasa powinna posiadać konstruktor bezparametrowy oraz drugi, pozwalający ustawić odpowiednie współrzędne
        w trakcie tworzenia obiektu.

        Klasa PointController posiada cztery metody, które pozwalają manipulować położeniem punktu:

        -addX() - zwiększa wartość pola x obiektu o 1,

        -minusX() - zmniejsza wartość pola x obiektu o 1,

        -addY() - zwiększa wartość pola y obiektu o 1,

        -minusY() - zmniejsza wartość pola y obiektu o 1.

        Każda z metod przyjmuje jako parametr obiekt typu Point i zmienia jego pola x oraz y.

        Obie klasy powinny znajdować się w osobnych pakietach, a ich działanie powinno zostać przetestowane w trzeciej
        klasie o nazwie PointApplication.
         */

        Point point = new Point(4, 17);
        PointController pointController = new PointController();
        System.out.println("Współrzędna X przed zmianą: ");
        System.out.println(point.getX());
        System.out.println("Zwiększenie o jeden: ");
        pointController.addX(point);
        System.out.println(point.getX());
        System.out.println("Zmniejszenie o jeden: ");
        pointController.minusX(point);
        System.out.println(point.getX());
        System.out.println();
        System.out.println("Współrzędna Y przed zmianą: ");
        System.out.println(point.getY());
        System.out.println("Zwiększenie o jeden: ");
        pointController.addY(point);
        System.out.println(point.getY());
        System.out.println("Zmniejszenie o jeden: ");
        pointController.minusY(point);
        System.out.println(point.getY());
    }
}
