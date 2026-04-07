import java.util.Random;
import java.util.ArrayList;
public class BookSuggestionSystem{

	static Random random = new Random();

	public static boolean validateArchiveIsNotEmpty(ArrayList <Book> archive){
		if (archive.isEmpty()){
			return false;
		}
		return true;
	}
	
	public static String suggestBook(ArrayList <Book> archive){
		
		Book book = archive.get(random.nextInt(archive.size()));
		String bookTitle = book.getBookTitle();
		String bookAuthor = book.getAuthorName();
		int pageNumber = random.nextInt(book.getNoOfPages()) + 1;

		return String.format("Book Title: %s%nBook Author: %s%nPage: %d%n", bookTitle, bookAuthor, pageNumber);
	}

	public static void addBook(ArrayList <Book> archive, Book newBook){
		archive.add(newBook);
	}

	public static boolean validateBookIsInArchive(ArrayList <Book> archive, String bookTitle){
		for (Book book : archive){
			if(book.getBookTitle().equalsIgnoreCase(bookTitle)){
				return true;
			}
		}
		return false;
	}
	public static void removeBook(ArrayList <Book> archive, String bookTitle){
		for (Book book : archive){
			if(book.getBookTitle().equalsIgnoreCase(bookTitle)){
				archive.remove(book);
				break;
			}
		}
	}
	
	public static void updateBook(ArrayList <Book> archive, String oldBookTitle, String newBookTitle){
		for (Book book : archive){
			if(book.getBookTitle().equalsIgnoreCase(oldBookTitle)){
				book.setBookTitle(newBookTitle);
				break;
			}
		}
	}

	public static String showBooks(ArrayList <Book> archive){
		StringBuilder output = new StringBuilder();
		for (Book book : archive){
			output.append(String.format(book + "%n"));
		}
		return output.toString();
	}

	public static int noOfBooksInArchive(ArrayList<Book> archive){
		return archive.size();
	}

	

}