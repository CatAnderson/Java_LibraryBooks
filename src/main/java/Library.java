import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int bookCapacity;

    public Library() {
        this.bookCollection = new ArrayList<Book>();
        this.bookCapacity = 5;
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (this.bookCapacity > bookCount());
        this.bookCollection.add(book);
    }

    public Book removeBook() {
        return this.bookCollection.remove(0);
    }

    public int getBookCapacity() {
        return this.bookCapacity;
    }
}
