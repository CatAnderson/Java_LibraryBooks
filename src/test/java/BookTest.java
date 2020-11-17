import org.junit.Before;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "Science Fiction")
    }

}
