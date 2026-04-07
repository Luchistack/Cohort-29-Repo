import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BookSuggestionAppTest {

    @Test
    public void testThatAllNewBooksAddedWillShow() {
        BookSuggestionApp.books = new ArrayList<>();
        BookSuggestionApp.books.add("The Clean Coder");
        BookSuggestionApp.books.add("Beauty and the Beast");
        BookSuggestionApp.books.add("Gone With The Wind");

        ArrayList<String> allBooks = BookSuggestionApp.showAllBooks();

        assertEquals(3, allBooks.size());
        assertEquals("The Clean Coder", allBooks.get(0));
        assertEquals("Beauty and the Beast", allBooks.get(1));
        assertEquals("Gone With The Wind", allBooks.get(2));
    }

    @Test
    public void testThatNewBookCanBeAdded() {
        BookSuggestionApp.books = new ArrayList<>();
        BookSuggestionApp.books.add("The Clean Coder");
        BookSuggestionApp.books.add("Beauty and the Beast");
        BookSuggestionApp.books.add("Gone With The Wind");

        boolean result = BookSuggestionApp.addBook("Animal Farm");

        assertTrue(result);
        assertEquals(4, BookSuggestionApp.books.size());
        assertTrue(BookSuggestionApp.books.contains("Animal Farm"));
    }

    

    @Test
    public void testThatBookCanBeRemoved() {
        BookSuggestionApp.books = new ArrayList<>();
        BookSuggestionApp.books.add("The Clean Coder");
        BookSuggestionApp.books.add("Beauty and the Beast");
        BookSuggestionApp.books.add("Gone With The Wind");

        boolean result = BookSuggestionApp.removeBook("Gone With The Wind");

        assertTrue(result);
        assertEquals(2, BookSuggestionApp.books.size());
        assertFalse(BookSuggestionApp.books.contains("Gone With The Wind"));
    }

   

    @Test
    public void testThatBookCanBeUpdated() {
        BookSuggestionApp.books = new ArrayList<>();
        BookSuggestionApp.books.add("The Clean Coder");
        BookSuggestionApp.books.add("Beauty and the Beast");
        BookSuggestionApp.books.add("Gone With The Wind");

        boolean result = BookSuggestionApp.updateBook("The Clean Coder", "How To Get Away With Murder");

        assertTrue(result);
        assertFalse(BookSuggestionApp.books.contains("The Clean Coder"));
        assertTrue(BookSuggestionApp.books.contains("How To Get Away With Murder"));
    }

    

    @Test
    public void testThatSuggestedBookIsFromTheList() {
        BookSuggestionApp.books = new ArrayList<>();
        BookSuggestionApp.books.add("The Clean Coder");
        BookSuggestionApp.books.add("Beauty and the Beast");
        BookSuggestionApp.books.add("Gone With The Wind");


        String suggestedBook = BookSuggestionApp.getSuggestedBook();

       
        assertTrue(BookSuggestionApp.books.contains(suggestedBook));
    }

    @Test
    public void testThatSuggestedPageNumberIsBetweenOneAndHundred() {
        int pageNumber = BookSuggestionApp.getRandomPageNumber();

        assertTrue(pageNumber >= 1 && pageNumber <= 100);
    }
}
