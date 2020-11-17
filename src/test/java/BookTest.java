import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "Science Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("Do Androids Dream of Electric Sheep?", book.getTitle());
    }

}
