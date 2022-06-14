import java.util.Scanner;
import java.text.NumberFormat;
public class ConditionalLabPt1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("Please input salary.");
		double salary = scan.nextDouble();
		System.out.println("Please input performance rating: 1=excellent, 2=good, and 3=poor.");
		int rating = scan.nextInt();
		double raise = 0;
		System.out.println("Salary is: "+money.format(salary));
		if (rating == 2) {
			raise = 0.03;
		} else if (rating == 1) {
			raise = 0.06;
		} else {
			raise = 0.01;
		}
		System.out.println("Percent raise: "+raise+"%");
		double amt = salary*raise;
		System.out.println("Amount of the raise: "+money.format(amt));
		double newsal = amt+salary;
		System.out.println("New salary: "+money.format(newsal));
	}
}
