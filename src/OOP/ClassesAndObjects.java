package OOP;

public class ClassesAndObjects {

    public static void main(String[] args) {
        /*
    Exercise 1
    Napisz program, w którym utworzysz dwie klasy:

    Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy. Podstawowe informacje o pracowniku jakie są
    potrzebne pracodawcy to imię, nazwisko, rok urodzenia, staż pracy,
    Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników,
    a następnie wyświetlisz informację o nich na ekranie.
     */
        Company company = new Company();
        System.out.println(company.getWorkers());
    }




}
