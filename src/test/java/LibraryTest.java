import org.junit.Before;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "Science Fiction");
    }
    
}
