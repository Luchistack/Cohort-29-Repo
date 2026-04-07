import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class BookLibraryTest{

    @Test
    public void addBookTest() {
    
    Book book = new Book("wisdom" , 12, "Timothy", "2025");
    
    BookLibrary library = new BookLibrary();
    boolean actual = library.addBook(book);

    boolean expected = true;

    assertEquals(expected, actual);
    }

    @Test
    public void testIfBookExist() {
    
    Book book = new Book("wisdom" , 12, "Timothy", "2025");
    
    BookLibrary library = new BookLibrary();
    
    library.addBook(book);
    boolean actual = library.doesBookExist(book);

    boolean expected = true;

    assertEquals(expected, actual);
    }

    @Test
    public void testIfBookDoesNotExist() {
    
    Book book = new Book("wisdom" , 12, "Timothy", "2025");
    
    BookLibrary library = new BookLibrary();
    
    boolean actual = library.doesBookExist(book);

    boolean expected = false;

    assertEquals(expected, actual);
    }

    @Test
    public void testIfBookHasBeenDeleted() {
    
    Book book = new Book("wisdom" , 12, "Timothy", "2025");
    
    BookLibrary library = new BookLibrary();
    
    library.addBook(book);
    boolean actual = library.removeBook(book);

    boolean expected = true;

    assertEquals(expected, actual);
    }

    @Test
    public void testIfBookUpdate() {
    
    Book book = new Book("wisdom" , 12, "Timothy", "2025");
    
    BookLibrary library = new BookLibrary();
    
    library.addBook(book);
    boolean actual = library.updateBook("wisdom", "Victor");

    boolean expected = true;

    assertEquals(expected, actual);
    }

}
