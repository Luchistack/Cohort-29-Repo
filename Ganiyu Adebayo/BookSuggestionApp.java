import java.util.Scanner;
import java.util.ArrayList;
public class BookSuggestionApp{

	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		ArrayList <Book> archive = new ArrayList<>();

		String mainMenu = """

			Welcome to the Book Suggestion System

			1. Get Suggestions
			2. Add Books
			3. Remove Book
			4. Update Book
			5. Show Books
			6. Exit

		""";
		String response;
		do {
			System.out.println(mainMenu);
			System.out.print("Enter option: ");
			response = input.nextLine();

			switch(response){
				case "1":
					String continuity;
					do{
						if (BookSuggestionSystem.validateArchiveIsNotEmpty(archive) == true){
							System.out.println(BookSuggestionSystem.suggestBook(archive));
						}
						else{
							System.out.println("Archive is empty");
						}
						System.out.print("Would you like to get another suggestion?(yes/no): ");
						continuity = input.nextLine().trim().toLowerCase();
					} while (continuity.equals("yes"));
					break;
		
				case "2":
					System.out.print("Enter book title: ");
					String bookTitle = input.nextLine();
					System.out.print("Enter author name: ");
					String authorName = input.nextLine();

					while (true){
						try{
							System.out.print("Enter number of pages: ");
							String noOfPages = input.nextLine().trim();
							BookSuggestionSystem.addBook(archive, new Book(bookTitle, authorName, noOfPages));
							System.out.println("Book added successfully!");
							break;
						} catch (IllegalArgumentException e){
							System.out.println("Invalid Input! Number only!");
						}
					}
					break;

				case "3":

					System.out.print("Enter book title to remove: ");
					String bookToRemove = input.nextLine();
					if (BookSuggestionSystem.validateBookIsInArchive(archive, bookToRemove) == true){
						BookSuggestionSystem.removeBook(archive, bookToRemove);
						System.out.println("Book removed successfully!");
					}
					else{
						System.out.println("Book title does not exist!");
					}
					break;

				case "4":
					System.out.print("Enter the old title: ");
					String oldTitle = input.nextLine().trim();
					if (BookSuggestionSystem.validateBookIsInArchive(archive, oldTitle) == true){
						System.out.print("Enter the new title: ");
						String newTitle = input.nextLine().trim();
						BookSuggestionSystem.updateBook(archive, oldTitle, newTitle);
						System.out.println("Book updated successfully!");
					}
					else{
						System.out.println("Book title does not exist!");
					}
					break;
				case "5":
					if (BookSuggestionSystem.validateArchiveIsNotEmpty(archive) == true){
						System.out.println(BookSuggestionSystem.showBooks(archive));
					}
					else{
						System.out.println("Archive is empty");
					}
					break;
				case "6":
					response = "6";
					System.out.println("Thank you for using our app!");
					break;
				default:
					System.out.println("Invalid Input!");


			}
		
		} while (response != "6");

	}

}