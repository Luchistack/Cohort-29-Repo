public class Book{

    private String bookTitle;
    private int bookPage;
    private String authorName;
    private String publicationYear;
          
    public Book(String bookTitle , int bookPage , String authorName, String publicationYear) {

        this.bookTitle = bookTitle;
        this.bookPage = bookPage;
        this.authorName = authorName;
        this.publicationYear = publicationYear;

    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookPage(int bookPage) {   
        this.bookPage = bookPage;
    }

    public void setAuthorName(String authorName) {
         this.authorName = authorName;        
    }

    public void setYearOfPublication(String publicationYear) {
        this.publicationYear = publicationYear;       
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookPage() {
        return bookPage;
    }

    public String getAuthorName() {
        return  authorName;
    }

    public String getYearOfPublication() {
        return publicationYear;   
    }

}
