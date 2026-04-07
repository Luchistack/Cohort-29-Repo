import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class BookSuggestionApp{

    public static void main(String[]args){
        

        String [] books = { 
                            "The Hobbit", 
                            "The Animal Farm", 
                            "Bell And The Dragon", 
                            "Last Days At Forcado High Scool"
        };

        theMainMenuOfTheBookSuggestionApp();
        suggestBook(books);
        




    }

    public static void theMainMenuOfTheBookSuggestionApp(){


        while (true){

            Scanner inputCollector = new Scanner(System.in);

            System.out.println("\n--- Welcome To The Book Suggestion App System ---");
            System.out.println("1. To Get Suggestion");
            System.out.println("2. To Add Book");
            System.out.println("3. To Remove Book");
            System.out.println("4. To Update Book");
            System.out.println("5. To Show All Books");
            System.out.println("6. Exit");

            System.out.print("Enter an Option From 1 - 6: ");
            int usersChoice = inputCollector.nextInt();
            inputCollector.nextLine();


            if (usersChoice == 1 ){
                suggestBook();

            }
            else if (usersChoice == 2 ){
                // addBook();

            }
            else if (usersChoice == 3 ){

                // return removeBook();
            }
            else if (usersChoice == 4 ){
                // return updateBook();

            }
            else if (usersChoice == 5 ){

                // return showAllBook();
            }
            else if (usersChoice == 6 ){

                break;
            }
            else {
                System.out.println("Invalid Input!!");
            }



        }





    }



    public static void suggestBook(String [] books){
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String bookChoice;

        while (true){
            int bookIndex = random.nextInt(books.length);
            int pageNumber = random.nextInt(100) + 1;

            System.out.println("Read \" " + books[bookIndex] + "\" starting from page: " + pageNumber);

            System.out.println("Would you like to get another suggestion?(yes/no): ");
            bookChoice = scanner.nextLine();

            if (!bookChoice.equalsIgnoreCase("yes")){
                System.out.println("Thank You For Using Our App, Goodbye!!");
                break;


            }
            



        }
         

    





    }

    


}
