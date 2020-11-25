package assignment4;
class BookStoreEmployee
{
	String bookTitle;
	double price;
	int year;
	String authorName;
	public BookStoreEmployee(String bookTitle, double price, int year, String authorName) {
		super();
		this.bookTitle = bookTitle;
		this.price = price;
		this.year = year;
		this.authorName = authorName;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
}
