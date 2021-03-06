package OOP;

public class Book {

    private final String title;
    private final int price;
    private final String isbn;
    private final Author author;

    public Book(Author author, String title, int price, String isbn){
        this.author = author;
        this.title = title;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }



}
