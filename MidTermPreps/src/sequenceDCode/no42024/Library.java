package sequenceDCode.no42024;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String libraryNumber;
    private List<Book> books;

    public Library(String libraryNumber) {
        this.libraryNumber = libraryNumber;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public double getBookPrice() {
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getBookPrice();
        }
        return totalPrice;
    }
}
