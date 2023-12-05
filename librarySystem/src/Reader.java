import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Library library, Book book) {
        if (library.getBooks().contains(book))
        {
            borrowedBooks.add(book);
            library.removeBook(book);
            System.out.println(name + " borrowed " + book.getTitle());
        }
        else
        {
            System.out.println("Library doesn't have this book");
        }
    }

    public void returnBook(Library library, Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            library.addBook(book);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println(name + " didn't borrow this book");
        }
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " haven't borrowed books");
        }
        else {
            System.out.println(name + " borrowed books:");
            for (Book book : borrowedBooks) {
                System.out.println(book.getTitle());
            }
        }
    }
}