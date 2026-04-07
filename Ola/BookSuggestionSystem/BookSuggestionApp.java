import java.util.Random;
import java.util.ArrayList;

public class BookSuggestionApp      {


    public static ArrayList<String> books = new ArrayList<>();

    public static ArrayList<String> showAllBooks() {
        return books;
    }

    public static boolean addBook(String title) {
        if (books.contains(title)) {
            return false;
        }
        books.add(title);
        return true;
    }

    public static boolean removeBook(String title) {
        return books.remove(title);
    }

    public static boolean updateBook(String oldTitle, String newTitle) {
        int index = books.indexOf(oldTitle);

        if (index == -1) {
            return false;
        }

        books.set(index, newTitle);
        return true;
    }

    public static String getSuggestedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int index = random.nextInt(books.size());
        return books.get(index);
    }

    public static int getRandomPageNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}


            
