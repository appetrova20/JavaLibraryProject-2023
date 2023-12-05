public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("title 1", "author 1", 2006);
        Book book2 = new Book("title 2", "author 2", 2006);
        Book book3 = new Book("title 3", "author 3", 2006);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Reader reader = new Reader("Aleksandra");

        reader.borrowBook(library, book1);
        reader.borrowBook(library, book2);

        reader.displayBorrowedBooks();

        reader.returnBook(library, book1);

        reader.displayBorrowedBooks();
    }
}