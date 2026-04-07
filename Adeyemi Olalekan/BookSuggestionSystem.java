import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookSuggestionSystem {
        
        static ArrayList<String> books = new ArrayList<>();
        static Scanner input = new Scanner(System.in);
        static Random random = new Random();

        static String indent = "\t\t";
        static String indentOne = "\t";
        static String userResponse = "";
        
        static String BLINK = "\u001B[5m";
        static String GREEN = "\u001B[32m";
        static String RED = "\u001B[31m";  
        static String YELLOW = "\u001B[33m";                    
        static String RESET = "\u001B[0m";                      
        static String PURPLE = "\u001B[35m";                       
        static String CYAN = "\u001B[36m";
        static String WHITE = "\u001B[37m";
        static String BOLD = "\u001B[1m";
        static String ITALIC = "\u001B[3m";
        static String BLUE   = "\u001B[44m";

        public static void main(String[] args) {
        
        books.add("The Iroko Tree And The Brave Farmer");
        books.add("The Orphan Boy");
        books.add("Raliat The Sugar Girl");
        books.add("A Man For All Season");
        books.add("The Greatest Wealth");
        books.add("She Works In Beauty");
        books.add("Bad Company Bad Manner");
        books.add("Things Fall Apart");
        books.add("To Kill A Monkey");
        books.add("Oliver Twist");
        books.add("Romeo And Juliet");
        books.add("Stay With Me");
        books.add("When Trouble Sleeps");
        books.add("The Last Day At Forcados High School");
        books.add("Asa");
        books.add("Nigerian Women Will Stain Your White");

        while (true) { 
            System.out.print(GREEN + "\n" + indent + "=============================================" + "\n" + RESET);
            System.out.println(indent + BOLD + "    " + "Welcome to the Book Suggestion System!" + RESET);
            System.out.print(GREEN + indent + "=============================================" + "\n" + RESET);

            System.out.println(CYAN + indentOne + "1. Get Suggestions" + RESET);
            System.out.println(CYAN + indentOne + "2. Add Book" + RESET);
            System.out.println(CYAN + indentOne + "3. Remove Book" + RESET);
            System.out.println(CYAN + indentOne + "4. Update Book" + RESET);
            System.out.println(CYAN + indentOne + "5. Show All Books" + RESET);
            System.out.println(CYAN + indentOne + "6. Exit" + RESET);
            
            System.out.print(GREEN + indent + "Enter your choice: " + RESET);
            String userChoice = input.nextLine();

            switch (userChoice) {
                case "1":
                    getSuggestions();
                    break;
                case "2":
                    addBook();
                    break;
                case "3":
                    removeBook();
                    break;
                case "4":
                    updateBook();
                    break;
                case "5":
                    showAllBooks();
                    break;
                case "6":
                    System.out.println("\n" + WHITE + BOLD + indent + "Goodbye!" + "\n" + RESET);
                    return;
                default:
                    System.out.println("\n" + YELLOW + indent + "Invalid option. Please enter a number from 1 to 6." + RESET);
            }
        }
        }


        public static void getSuggestions() {

        if (books.isEmpty()) {
        System.out.println("No books available. Please add book to the libary.");
        return;
        }

        while (true) {

            String title = books.get(random.nextInt(books.size()));
            int page = random.nextInt(100) + 1;

            System.out.println("\n" + WHITE + indent + ITALIC + BOLD + "--Book for the Day--" + "\n" + RESET);
            System.out.println(CYAN + indentOne + "Book Title: " + title);
            System.out.println(CYAN + indentOne + "Page: " + page);

            System.out.print(CYAN + indentOne + "Would you like to get another suggestion? (yes/no): ");
            String userAnswer = input.nextLine();

            if (!userAnswer.equalsIgnoreCase("yes")){
            System.out.print("\n" + indent + WHITE + ITALIC + BOLD + "Press 'ok' To Start Reading: ");
            String userResponse = input.nextLine(); 

            if (!userResponse.equalsIgnoreCase("ok")) {
            System.out.println("\n" + RED + indentOne + "❗️Invalid Response! Please type 'ok' to start reading." + RESET);
            return;
            }
            System.out.print("\n" + WHITE + indent + BOLD + ITALIC + "Happy Reading!😎️" + "\n" + RESET);
            break;
            
            }
        }
        }


        public static void addBook() {
        System.out.print("\n" + GREEN + indent + "Enter the book title: " + RESET);
        String title = input.nextLine();

        if (title.isEmpty()) {
        System.out.println("\n" + YELLOW + indent + "Book title cannot be empty, add book title." + RESET);
        return;
           }

        if (!title.matches("[a-zA-Z ]+")) {
        System.out.println("\n" + RED + indentOne + "❗️Invalid book title! kindly input letters only." + RESET);
        return;
        }

        for (int index = 0; index < books.size(); index++) {
            if (books.get(index).equalsIgnoreCase(title)) {
        System.out.println("\n" + YELLOW + indent + title +  " already exists in the list." + RESET);
        return;
            }
        }

        books.add(title);
        System.out.println("\n" + WHITE + indent + ITALIC + "Book added successfully!" + RESET);

        }


        public static void removeBook() {
        System.out.print("\n" + CYAN + indent + "Enter the book title to remove: " + RESET);
        String title = input.nextLine();

        if (title.isEmpty()) {
        System.out.println("\n" + YELLOW + indent + "Book title cannot be empty, add book title." + RESET);
        return;
           }

        if (!title.matches("[a-zA-Z ]+")) {
        System.out.println("\n" + RED + indentOne + "❗️Invalid book title! kindly input letters only." + RESET);
        return;
        }
        
        for (int index = 0; index < books.size(); index++) {
            if (books.get(index).equalsIgnoreCase(title)) {
                books.remove(index);
                System.out.println("\n" + indent + RED + "Book removed successfully!" + RESET);
                return;
            }
        }

        System.out.println("\n" + YELLOW + indent + title + " not found in the list." + RESET);

        }


        public static void updateBook() {
        System.out.print("\n" + indent + CYAN + "Enter the old title: " + RESET);
        String oldTitle = input.nextLine();

         if (oldTitle.isEmpty()) {
        System.out.println("\n" + YELLOW + indent + "Book title cannot be empty, add book title." + RESET);
        return;
           }
        
        if (!oldTitle.matches("[a-zA-Z ]+")) {
        System.out.println("\n" + RED + indentOne + "❗️Invalid old title! kindly input letters only." + RESET);
        return;
        }

        int count = -1;
        for (int index = 0; index < books.size(); index++) {
            if (books.get(index).equalsIgnoreCase(oldTitle)) {
                count = index;
                break;
            }
        }

        if (count == -1) {
            System.out.println("\n" + indent + YELLOW + oldTitle + " not found in the list." + RESET);
            return;
        }

        System.out.print("\n" + indent + CYAN + "Enter the new title: " + RESET);
        String newTitle = input.nextLine();

         if (newTitle.isEmpty()) {
        System.out.println("\n" + YELLOW + indent + "Book title cannot be empty, add book title." + RESET);
        return;
           }

        if (!newTitle.matches("[a-zA-Z ]+")) {
        System.out.println("\n" + RED + indentOne + "❗️Invalid new title! kindly input letters only." + RESET);
        return;
        }

        if (newTitle.isEmpty()) {
            System.out.println("\n" + YELLOW + indent + "New title cannot be empty." + RESET);
            return;
        }

        for (int index = 0; index < books.size(); index++) {
            if (index != count && books.get(count).equalsIgnoreCase(newTitle)) {
                System.out.println("\n" + YELLOW + indent + newTitle + " already exists in the list." + RESET);
                return;
            }
        }

        books.set(count, newTitle);
        System.out.println("\n" + WHITE + indent + "Book updated successfully!" + RESET);
        }


        public static void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("\n" + YELLOW + indent + "No books available." + RESET);
            return;
        }

        System.out.println("\n" + WHITE + BOLD + indent + "--All Books--" + RESET);
        for (int index = 0; index < books.size(); index++) {
            System.out.println("\n" + CYAN + indent + (index + 1) + ". " + books.get(index));
        }
    }
}
