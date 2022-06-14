import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("\nWhat would you like to do?\n\n\t 1: here\n\t 2: here\n\t 3: here\n\t 4: here\n\t 5: here\n\nInput: ");
		int choice = scan.nextInt();
		while (choice <= 0 || choice > 5) {
			System.out.print("Error: Choice must be between 1 and 5.");
			System.out.print("\nWhat would you like to do?\n\n\t 1: here\n\t 2: here\n\t 3: here\n\t 4: here\n\t 5: here\n\nInput: ");
			choice = scan.nextInt();
		}
		switch (choice) {
		case 1:
			//up to 99
			for (int i=1; i<=99; i+=2) {
				System.out.println(i);
			}
			break;
		case 2:
			//multiples of 3
			for (int i=300; i>=3; i-=3) {
				System.out.println(i);
			}
			break;
		case 3:
			System.out.print("Enter an integer: ");
			int a = scan.nextInt();
			while (a < 2) {
				System.out.print("Error: Integer must be larger than two. Enter an integer: ");
				a = scan.nextInt();
			}

			double sum = 0;
			for (int i=2; i<=a; i+=2) {
				sum+=i;
			} System.out.print("Sum of all even numbers between 2 and "+a+": "+sum+"\n");
			break;
		case 4:
			scan.nextLine();
			System.out.print("\nPlease enter a string: ");
			String str = scan.nextLine();
			int strLength = str.length();
			for (int i=0; i<strLength; i++) {
				System.out.print("\n"+str.charAt(i));
			}
			break;
		case 5:
			//Read 10 values from the user and then print the lowest, highest, and average value entered. Optional challenge: Calculate the median value entered as well. One approach would be to use arrays, which we haven’t covered yet but have a sorting method available that would help.
			double array[] = new double[10];
			double average = 0;
			for (int i = 0; i<=9; i++) {
				System.out.print("Enter value "+(i+1)+": ");
				double t = scan.nextDouble();
				average += t;
				array[i] = t;
			}
			Arrays.sort(array);
			average = (average/10);
			double median = (array[4]+array[5])/2;
			System.out.print("\n"+Arrays.toString(array));
			System.out.print("\nLowest value: "+array[0]);
			System.out.print("\nHighest value: "+array[9]);
			System.out.print("\nAverage value: "+average);
			System.out.print("\nMedian value: "+median);

			break;
		default:
			System.out.print("\nInvalid Choice.\n");
		}
	}
}