import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookSuggestionSystemTest{

	@Test
	public void testThatTheArchiveIsEmpty(){
		ArrayList <Book> archive = new ArrayList<>();
		boolean expected = BookSuggestionSystem.validateArchiveIsNotEmpty(archive);
		assertFalse(expected);
	}

	@Test
	public void testTheArchiveIsNotEmpty(){
		ArrayList <Book> archive = new ArrayList<>();
		String bookTitle = "48 Laws of Power";
		String authorName = "Robert Green";
		String noOfPages = "988";
		BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));
		boolean expected = BookSuggestionSystem.validateArchiveIsNotEmpty(archive);
		assertTrue(expected);
	}

	@Test
	public void testNumberOfBooksInArchive(){
		ArrayList <Book> archive = new ArrayList<>();
		String bookTitle = "48 Laws of Power";
		String authorName = "Robert Green";
		String noOfPages = "988";
		BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));

		bookTitle = "Clean Code";
		authorName = "Robert C Martin";
		noOfPages = "563";
		BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));

		int actual = BookSuggestionSystem.noOfBooksInArchive(archive);
		int expected = archive.size();
		assertEquals(actual, expected);

	}

	@Test
	public void testThatABookIsInArchive(){
		ArrayList <Book> archive = new ArrayList<>();
		String bookTitle = "48 Laws of Power";
		String authorName = "Robert Green";
		String noOfPages = "988";
		BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));
		boolean expected = BookSuggestionSystem.validateBookIsInArchive(archive, "48 Laws Of Power");
		assertTrue(expected);

	}

	@Test
	public void testThatABookIsRemoved_whenYouRemove(){
		ArrayList <Book> archive = new ArrayList<>();
		String bookTitle = "48 Laws of Power";
		String authorName = "Robert Green";
		String noOfPages = "988";
		BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));

		bookTitle = "Clean Code";
		authorName = "Robert C Martin";
		noOfPages = "563";
		BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));

		BookSuggestionSystem.removeBook(archive, "48 Laws Of Power");

		int actual = BookSuggestionSystem.noOfBooksInArchive(archive);
		int expected = 1;
		assertEquals(actual, expected);
	}

	@Test
	public void testThatABookTitleIsUpdated(){
		ArrayList <Book> archive = new ArrayList<>();
		String bookTitle = "48 Laws of Power";
		String authorName = "Robert Green";
		String noOfPages = "988";
		BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));

		bookTitle = "Clean Code";
		authorName = "Robert C Martin";
		noOfPages = "563";
		BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));

		BookSuggestionSystem.updateBook(archive, "48 Laws of Power", "The Laws Of Power");
		boolean expected = BookSuggestionSystem.validateBookIsInArchive(archive, "The Laws Of Power");
		assertTrue(expected);
	}

	@Test
	public void testThatABookTitleIsUpdated_previousTitleNotInArchive(){
		ArrayList <Book> archive = new ArrayList<>();
		String bookTitle = "48 Laws of Power";
		String authorName = "Robert Green";
		String noOfPages = "988";
		BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));

		bookTitle = "Clean Code";
		authorName = "Robert C Martin";
		noOfPages = "563";
		BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));

		BookSuggestionSystem.updateBook(archive, "48 Laws of Power", "The Laws Of Power");
		boolean expected = BookSuggestionSystem.validateBookIsInArchive(archive, "48 Laws Of Power");
		assertFalse(expected);
	}


}