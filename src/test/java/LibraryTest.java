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

    //    Add a capacity to the library
//    and write a method to check if stock is
//    full before adding a book.
    
    @Test
    public void hasBookCapacity(){
        assertEquals(0, library.getBookCapacity());
    }


}
