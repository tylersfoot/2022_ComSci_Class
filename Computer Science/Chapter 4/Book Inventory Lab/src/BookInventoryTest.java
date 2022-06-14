public class BookInventoryTest {

	public static void main(String[] args) {
		
		BookInventory amongus = new BookInventory("The Art of Among Us", 69.69, 727, 4200, 3235, 4.8);
		BookInventory amongus2 = new BookInventory("The Art of Among Us", 69.69, 727, 4200, 3235, 4.8);
		BookInventory amongus3 = new BookInventory("The Art of Among Us", 69.69, 727);
		
		System.out.println(amongus.getCopies());
		amongus.addInventory(727);
		System.out.println(amongus.getCopies());
	}
}
