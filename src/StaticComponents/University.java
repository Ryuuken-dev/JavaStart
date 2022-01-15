package StaticComponents;

public class University {

    public static void main(String[] args) {

        /*
        Utwórz program składający się z dwóch klas:

        Student - pozwala przechowywać informację o imieniu, nazwisku i numerze indeksu studenta
        University - klasa z metodą main, w której utworzysz kilku (co najmniej 2 studentów)
        W klasie Student zdefiniuj pole statyczne, która wraz z tworzeniem nowego obiektu tej klasy będzie zwiększane o
        1, a tym samym pozwoli śledzić liczbę studentów na uczelni.

        Po utworzeniu co najmniej dwóch studentów w klasie university, wyświetl liczbę studentów na uczelni.
         */

        System.out.println("Liczba studentów przed zapisami: " + Student.getStudentsQuantity());
        Student asia = new Student("Joannna", "Żmijewska", 1);
        Student tomasz = new Student("Tomasz", "Gleb", 2);
        System.out.println("Liczba studentów po zapisach: " + Student.getStudentsQuantity());
    }
}
