import java.util.ArrayList;

public class BookWorm {

    private String name;
    private ArrayList<Book> collection;

    public BookWorm(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int getCollectionCount() {
        return this.collection.size();
    }

    public void addBookToCollection(Book book) {
        this.collection.add(book);
    }
}
