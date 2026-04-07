import java.util.Scanner;
import java.util.List;

    public class BookSystemUI{

    private final Scanner input;
    private final BookSystem bookShelf;
    
    public void main (String ...args){
    
        start();
    }
    

    public BookSystemUI(){

    this.input = new Scanner(System.in);
    this.bookShelf = new BookSystem();
    }


    public void start(){

    int menuOption =0;

    while (menuOption != 6){
    showMenu();
    System.out.print("Enter option: ");
    menuOption = input.nextInt();
    input.nextLine();

    switch (menuOption) {
    case 1 -> handleSuggestBook();
    case 2 -> handleAddBook();
    case 3 -> handleRemoveBook();
    case 4 -> handleUpdateBook();
    case 5 -> handleShowAllBooks();
    case 6 -> System.out.println("\tGoodbye!");
    default -> System.out.println("Invalid option. Try again.");
    }

    }
    }

    public void showMenu() {
    System.out.println("""

                Welcome to the Book Suggestion System!
                1. Get Suggestions
                2. Add Book
                3. Remove Book
                4. Update Book
                5. Show all Books
                6. Exit
             
             
             """);
    }

    public void handleSuggestBook() {
    String response = "yes";

    while (response.equalsIgnoreCase("yes")) {
    Book suggestedBook = bookShelf.suggestBook();
    if (suggestedBook == null) {
    System.out.println("No books available to suggest!");
    return;
    }

    System.out.printf("""
                    %nBook of the Day:
                    
                    Book Title      : %s
                    suggested page  : %d %n 
                    
                    """,
                    suggestedBook.getTitle(), 
                    suggestedBook.getSuggestedPage()
                    
                    );

    System.out.print("\nWould you like another suggestion? (yes/no): ");
    response = input.nextLine();
    }
    }


    public void handleAddBook(){

    System.out.print("Enter title: ");
    String title = input.nextLine();
    System.out.print("Enter Author Name: ");
    String authorName = input.nextLine();
    System.out.print("Enter number of pages: ");
    String pages = input.nextLine();

    if(validatePages(pages)){

    boolean success = bookShelf.addBook(new Book(title, authorName,pages));

            if (success) {
            System.out.println("\nBook added successfully!");
            }else{
                
                System.out.println("Book already exists!!!");
            } 
    
    }else System.out.println("Invalid page number!!!");
    }

    public boolean validatePages(String pages){
         return pages.matches("[0-9]+");
    }
    public void handleRemoveBook(){

        System.out.print("Enter title of book to remove: ");
        String title = input.nextLine();

        if(bookShelf.removeBook(title)){

        System.out.print("\nBook Removed successfully\n");
        }else System.out.print("\nBook does not exist!!");

        }
        
    public void handleUpdateBook(){

        System.out.print("Enter title of book to update: ");
        String oldTitle = input.nextLine();
        
        System.out.print("Enter new title: ");
        String newTitle = input.nextLine();

        if(bookShelf.updateBook(oldTitle,newTitle)){

        System.out.print("\nBook updated successfully\n");
        }else System.out.print("\nBook does not exist!!");

        }
        
     public void handleShowAllBooks(){

        List<Book> books = bookShelf.getAllBooks();
        if(books.isEmpty()){
        System.out.print("\nNo books to display!!\n");
        return;
        }
        
        int index = 1;
        System.out.print("\nAllBooks:\n");
        for(Book book : books){
            System.out.printf("""
                    %d. %-5s
                    """,
                    index++,book.getTitle()
                    );
        }
        System.out.print("\nKindly press enter to return to menu..\n");
        input.nextLine();
        return;

        }

    }


