public class BookInventory {

	private String title;
	private double price;
	private int pages;
	private int copies;
	private int numRatings;
	private double avgRating;

	public BookInventory (String bookTitle, double bookPrice, int bookPages, int bookCopies, int bookNumRatings, double bookAvgRating) {
		title = bookTitle;
		price = bookPrice;
		pages = bookPages;
		copies = bookCopies;
		numRatings = bookNumRatings;
		avgRating = bookAvgRating;
	}
	
	public BookInventory (String bookTitle, double bookPrice, int bookPages) {
		title = bookTitle;
		price = bookPrice;
		pages = bookPages;
		copies = 4200;
		numRatings = 69;
		avgRating = 4.3;
	}
	
	public void addInventory (int books) {copies+=books;}
	public void sellInventory (int books) {copies-=books;}
	public void updateRating (double rating) {
		avgRating = (numRatings * avgRating + rating)/(numRatings+1);
		numRatings++;
	}
	
	public void setTitle(String newTitle) {title = newTitle;}
	public void setPrice(double newPrice) {
		if ((newPrice-price)/price >= 0.25 || (newPrice-price)/price <= -0.25) {
			System.out.println("Warning: New price is over 25% difference.");
		}
		price = newPrice;
	}
	public void setCopies(int newCopies) {copies = newCopies;}
	public void setAvgRating(int newAvgRating) {avgRating = newAvgRating;}
	
	public String getTitle() {return title;}
	public double getPrice() {return price;}
	public int getCopies() {return copies;}
	public double getAvgRating() {return avgRating;}
	
	public String toString() {
		return title+"\t"+price+"\t"+pages+"\t"+copies+"\t"+numRatings+"\t"+avgRating;
	}
	
}
