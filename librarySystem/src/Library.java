import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> getBooks() {
        return books;
    }

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}