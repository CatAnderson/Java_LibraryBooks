import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookWormTest {

    private BookWorm bookWorm;
    private Book book;
    private Library library;

    @Before
    public void before(){
        bookWorm = new BookWorm("Violet");
        library = new Library();
        book = new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "Science Fiction");
    }

    @Test
    public void hasName(){
        assertEquals("Violet", bookWorm.getName());
    }

    @Test
    public void hasNoBooksInCollection(){
        assertEquals(0, bookWorm.getCollectionCount());
    }
}
