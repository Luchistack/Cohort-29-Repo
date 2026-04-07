import java.util.ArrayList;

public class BookLibrary{

    private ArrayList< Book > bookDetails = new ArrayList<>();

//    Book book = new Book(); 

    
    public boolean addBook(Book book) {
       
        bookDetails.add(book);
        return true;
    }

    public boolean doesBookExist(Book book) {

        if(bookDetails.contains(book)) {
            return true;
        }
        return false;
    }

    public boolean removeBook(Book book) {

        if(doesBookExist(book)) {

        bookDetails.remove(book);
        return true;

        }
        return false;
    }

    public boolean updateBook(String bookTitle, String newBookTitle) {
        
        for(int index =0; index < bookDetails.size(); index++) {
        if(bookDetails.get(index).getBookTitle().equalsIgnoreCase(bookTitle)) {

            bookDetails.get(index).setBookTitle(newBookTitle);
            return true;
        }
        }
        return false;
    }

}



