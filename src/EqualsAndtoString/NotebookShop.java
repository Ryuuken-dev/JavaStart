package EqualsAndtoString;

public class NotebookShop {

    /*
    Napisz program, który symuluje sklep komputerowy specjalizujący się w sprzedaży notebooków. Stwórz trzy klasy:

    Computer - klasa posiada pola producer i model - czyli informacje o producencie i modelu komputera, przy czym model
    jest reprezentowany za pomocą liczby całkowitej. Zdefiniuj w niej metodę equals(), która pozwoli na zweryfikowanie,
    czy jest to jedyny taki egzemplarz w sklepie. Przesłoń także metodę toString(), która pozwoli uzyskać czytelną
    informację o danym egzemplarzu.
    DataStore - klasa przechowuje informacje o komputerach w tablicy. Pozwala na dodanie kolejnego komputera do bazy
    poprzez metodę add() oraz drugą metodę pozwalającą pobrać informację o wszystkich dodanych notebookach. Powinna
    również istnieć metoda checkAvailability(), która jako parametr przyjmuje obiekt klasy Computer i zwraca liczbę
    identycznych komputerów w sklepie.
    NotebookShop - klasa z metodą main. Utwórz w niej co najmniej 5 komputerów i dodaj je do bazy sklepu. Co najmniej 2
    komputery muszą być takie same. Dla powtarzającego się egzemplarza sprawdź działanie metody checkAvailability(),
    a na końcu wyświetl wszystkie notebooki dostępne w sklepie

    Ograniczenia: w sklepowym magazynie jest miejsce na maksymalnie 100 komputerów.
     */

    public static void main(String[] args) {

        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Dell", 112));
        dataStore.add(new Computer("Dell", 112));
        dataStore.add(new Computer("Fujitsu", 12));
        dataStore.add(new Computer("Lenovo", 1121));
        dataStore.add(new Computer("HP", 22345));
        System.out.println(dataStore.getInfo());
        Computer dell = new Computer("Dell", 112);
        System.out.println("Liczba identycznych urządzeń" + " (" + dell + "): ");
        System.out.println(dataStore.checkAvailability(dell));
    }
}
