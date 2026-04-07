import java.util.Random;
import java.util.ArrayList;

public class BookSuggestionSystem{

    public ArrayList<String> books = new ArrayList<>();

    public BookSuggestionSystem(){

    books.add("Last days at forcados high school");
    books.add("Introduction to benthic ecology");
    books.add("Independence");


        }

    public void addBook(String bookName) {
        books.add(bookName);
        
    }

    public ArrayList<String> getBooks(){
        return books;
    }

    
    
    public int generateRandomPage(){
    Random random = new Random();
    return random.nextInt(100) + 1;



        } 
    public boolean removeBook(String bookName) {
        if (books.contains(bookName)) {
           return books.remove(bookName);
       } 
        return false;
    }
     
    }

