package OOP;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class General {

    public static void main(String[] args) {
        /*
        Exercise 1
        Napisz program, w którym utworzysz dwie klasy:

        Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy.
        Podstawowe informacje o pracowniku jakie są potrzebne pracodawcy to imię, nazwisko, rok urodzenia, staż pracy.

        Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników,
        a następnie wyświetlisz informację o nich na ekranie.
     */

        //Solution:
//        Company company = new Company();
//        System.out.println(company.getWorkers());

        /*
        Exercise 2
        Stwórz klasę reprezentującą książkę. Książka jest określona przez tytuł, cenę, autora, ISBN. Autor ma imię,
        nazwisko, płeć. Pozwól na odczyt wszystkich właściwości książki oraz autora, ale nie na ich zmianę spoza klasy.

         */
        //Solution:
//        Author author1 = new Author("Brandon", "Sanderson", "male");
//        Book book1 = new Book(author1, "Archiwum Burzowego Swiatła", 60, "1234");
//        BookInfo bookInfo = new BookInfo();
//        System.out.println(bookInfo.getBookInfo(book1, author1));
        // book1.title = "Krzyżacy";
        // author1.name = "Henryk";


        /*
        Stwórz klasę Flight reprezentującą lot. Lot jest określony przez miasto wylotu, miasto docelowe, cenę, datę,
        liczbę miejsc, listę pasażerów. Stwórz odpowiedni konstruktor, który pozwoli na utworzenie lotu poprzez
        podanie miasta początkowego, docelowego, liczby miejsc, ceny oraz daty. Lista pasażerów powinna być
        reprezentowana poprzez tablicę. Każdy pasażer ma imię, nazwisko, płeć, wiek - również stwórz odpowiednią klasę.
        Klasa Flight powinna mieć metodę pozwalającą dopisać pasażera do listy, pod warunkiem że są jeszcze wolne miejsca.
        Wszystkie pola z tej klasy powinny być dostępne do odczytu.
        Do reprezentacji daty użyj jednej z dostępnych w Javie klas (sprawdź jakiej).
         */

        //Solution:
        Date date1 = new Date();
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        Passenger passenger1 = new Passenger("Alicja", "Zakrzewska", "female", 27);
        Passenger passenger2 = new Passenger("Jan", "Kowalski", "male", 33);
        Passenger passenger3 = new Passenger("Aurelia", "Morrison", "female", 24);
        Passenger passenger4 = new Passenger("Anna", "Zabiel", "female", 19);
        Flight flight = new Flight("Warszawa", "Helsinki", 1000, 3,
                date.format(date1));
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        System.out.println(flight.getPassengers());
        System.out.println("Data wylotu:\n" + flight.getDate() + '\n');
        System.out.println("Miasto początkowe:\n" + flight.getCityOfDeparture());
        System.out.println("Miasto docelowe:\n" + flight.getDestinationCity() + '\n');
        System.out.println("Liczba pasażerów:\n" + flight.getNumberOfPlaces());




    }

}
