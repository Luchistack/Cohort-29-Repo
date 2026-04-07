import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BookSuggestionSystemTest {

    @Test
    public void testAddBook() {

        boolean expected = true;
        boolean actual = BookSuggestionSystem.addBook("New Book");

        assertEquals(expected, actual);
    }


    @Test
    public void testAddBookDuplicate() {

        BookSuggestionSystem.books.add("Things Fall Apart");

        boolean expected = false;
        boolean actual = BookSuggestionSystem.addBook("Things Fall Apart");

        assertEquals(expected, actual);
    }


    @Test
    public void testRemoveBook() {

        BookSuggestionSystem.books.add("Oliver Twist");

        boolean expected = true;
        boolean actual = BookSuggestionSystem.removeBook("Oliver Twist");

        assertEquals(expected, actual);
    }


    @Test
    public void testUpdateBook() {

        BookSuggestionSystem.books.add("Old Book");

        boolean expected = true;
        boolean actual = BookSuggestionSystem.updateBook("Old Book", "New Book");

        assertEquals(expected, actual);
    }
}
