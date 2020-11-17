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
    public void addBookToLibrary(){
        assertEquals(1, library.addBook());
    }
}
