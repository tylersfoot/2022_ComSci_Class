
public class Humidity {

	public static void main(String[] args) {
		int temp = 80, humidity = 50;
		if (temp > 90 || humidity >= 60) {
			System.out.println("I'd stay inside and play video games.");
		}
		if (temp < 32 && humidity == 100) {
			System.out.println("It's snowing.");
		}
		
		boolean snowing = false;
		if (!snowing) {
			System.out.println("It is not snowing.");
		} else {
			System.out.println("It is snowing!");
		}
	}

}
