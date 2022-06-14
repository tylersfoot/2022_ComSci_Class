import java.util.Scanner;
public class ConditionalLabPt2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the x of a point on a coordinate plane: ");
		double x = scan.nextDouble();
		System.out.println("Enter the y of a point on a coordinate plane: ");
		double y = scan.nextDouble();
		String quad = "the y-axis";
		// 5 is x axis, 6 is y axis, 7 is origin

		if (x > 0) {
			if (y > 0) {
				quad = "quadrant 1";
			} else if (y < 0) {
				quad = "quadrant 4";
			} else {
				quad = "the x-axis";
			}
		} else if (x < 0) {
			if (y > 0) {
				quad = "quadrant 2";
			} else if (y < 0) {
				quad = "quadrant 3";
			} else {
				quad = "the x-axis";
			}
		} else if (y == 0 && x == 0) {
			quad = "the origin";
		}
		System.out.println("The point is located on "+quad);
	}
}
