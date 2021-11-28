package OOP;

public class BookInfo {

    public String getBookInfo(Book book, Author author){
        return "Title: " + book.getTitle() + '\n' + "Author: " + author.getName() + " " + author.getSurname() + '\n' +
                "Price: " + book.getPrice() + '\n' + "ISBN number: " + book.getIsbn();
    }
}
