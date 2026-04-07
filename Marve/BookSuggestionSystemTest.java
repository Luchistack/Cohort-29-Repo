import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BookSuggestionSystemTest{
    @Test
    public void testThatRangeOfThePageNumberIsBetween1And100 (){
    BookSuggestionSystem testing = new BookSuggestionSystem();
    int page = testing.generateRandomPage();
    assertTrue(page >= 1 && page <= 100);
    }
    

    @Test
    public void testThatBooksAreInTheList(){
    BookSuggestionSystem testing = new BookSuggestionSystem();
    ArrayList <String> expected = new ArrayList <>();
    expected.add("Last days at forcados high school");
    expected.add("Introduction to benthic ecology");
    expected.add("Independence");

    ArrayList <String> actual = testing.getBooks();
    assertEquals(expected,actual);
    }

    @Test
    public void testThatAbookIsAddedToTheList(){
    BookSuggestionSystem testing = new BookSuggestionSystem();
    testing.addBook("Atomic Habits");
    ArrayList <String> expected = new ArrayList <>();
    
    expected.add("Last days at forcados high school");
    expected.add("Introduction to benthic ecology");
    expected.add("Independence");
    expected.add("Atomic Habits");
    
    ArrayList <String> actual = testing.getBooks();
    assertEquals(expected,actual);
    
    }
    
    @Test
    public void testThatAbookIsRemovedFromTheList(){
    BookSuggestionSystem testing = new BookSuggestionSystem();
    testing.addBook("Atomic Habits");
   
    boolean result =  testing.removeBook("Atomic Habits");
    assertTrue(result);
    }
    
     @Test
    public void testThatAbookNotFoundInTheBookListCannotBeRemovedFromTheList(){
    BookSuggestionSystem testing = new BookSuggestionSystem();
    boolean result =  testing.removeBook("The Only Child");
    assertFalse(result);
    }

    }



    
