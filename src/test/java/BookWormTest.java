import org.junit.Before;

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
}
