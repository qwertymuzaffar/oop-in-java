import java.util.ArrayList;

public class Library {
    private ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.addBook("The Great Gatsby");
        myLibrary.addBook("To Kill a Mockingbird");
        myLibrary.displayBooks();
    }
}
