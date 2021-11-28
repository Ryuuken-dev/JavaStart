package OOP;

public class ClassesAndObjects {

    public static void main(String[] args) {
        /*
        Exercise 1
        Napisz program, w którym utworzysz dwie klasy:

        Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy.
        Podstawowe informacje o pracowniku jakie są potrzebne pracodawcy to imię, nazwisko, rok urodzenia, staż pracy.

        Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników,
        a następnie wyświetlisz informację o nich na ekranie.
     */

//        Company company = new Company();
//        System.out.println(company.getWorkers());

        /*
        Exercise 2
        Stwórz klasę reprezentującą książkę. Książka jest określona przez tytuł, cenę, autora, ISBN. Autor ma imię,
        nazwisko, płeć. Pozwól na odczyt wszystkich właściwości książki oraz autora, ale nie na ich zmianę spoza klasy.
         */

        Author author1 = new Author("Brandon", "Sanderson", "male");
        Book book1 = new Book(author1, "Archiwum Burzowego Swiatła", 60, "1234");
        BookInfo bookInfo = new BookInfo();
        System.out.println(bookInfo.getBookInfo(book1, author1));
        // book1.title = "Krzyżacy";
        // author1.name = "Henryk";


    }






}
