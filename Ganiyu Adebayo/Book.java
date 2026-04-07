public class Book{

	private String bookTitle;
	private String authorName;
	private String noOfPages;

	public Book(String bookTitle, String authorName, String noOfPages){
		try{
			Integer.valueOf(noOfPages);
		} catch (IllegalArgumentException e){
			throw new IllegalArgumentException("Input should be numeric");
		}

		this.noOfPages = noOfPages;
		this.bookTitle = bookTitle;
		this.authorName = authorName;

	}

	public void setBookTitle(String bookTitle){
		this.bookTitle = bookTitle;
	}
	public String getBookTitle(){
		return bookTitle;
	}
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	public String getAuthorName(){
		return authorName;
	}
	public void setNoOfPages(String noOfPages){
		try{
			Integer.valueOf(noOfPages);
			this.noOfPages = noOfPages;
		} catch (IllegalArgumentException e){
			throw new IllegalArgumentException("Input should be numeric");
		}
	}
	public int getNoOfPages(){
		return Integer.valueOf(noOfPages);
	}

	@Override
	public String toString(){
		return String.format("Book Title: %s%nAuthor Name: %s%nNo of Pages: %d%n", getBookTitle(), getAuthorName(), getNoOfPages());
	}

}