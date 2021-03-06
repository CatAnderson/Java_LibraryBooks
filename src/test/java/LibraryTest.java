import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "Science Fiction");
    }

    @Test
    public void hasNoBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addingBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void removeBookFromLibrary(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void hasStock(){
        assertEquals(5, library.getBookCapacity());
    }

    @Test
    public void fullStockDoNotAddBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.getBookCapacity());
    }

}
