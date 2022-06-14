import java.util.Random;
public class MethodsPracticeQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cubeThatNumber(1));
		System.out.println(cubeThatNumber(2));
		System.out.println(cubeThatNumber(3));
		System.out.println(cubeThatNumber(4));
		System.out.println(cubeThatNumber(5));
		System.out.println(cubeThatNumber(6));
		System.out.println(cubeThatNumber(7));
		System.out.println(cubeThatNumber(8));
		System.out.println(cubeThatNumber(9));
		System.out.println(cubeThatNumber(10));
		System.out.println(cubeThatNumber(727));
	}

	public static double cubeThatNumber(int x) {
		int a=0;
		for (int i = x; i>0; i--) {
			for (int o = x; o>0; o--) {
				for (int p = x; p>0; p--) {
					a++;
				}
			}
		}
		return a;
	}

	public double absoluteValue(double x) {
		if (x < 0) {
			return x*=-1;
		}
		return x;
	}

	public double calculateSlope(double a, double b, double c, double d) {
		return (d-b)/(c-a);
	}

	public void multiplesOfFive(int a) {
		while (a>=5) {
			System.out.println(a);
			a-=5;
		}
	}


	public double withSalesTax(double price, String state) {
		if (state.equals("New Jersey")) {
			return price*1.066;
		}
		else if (state.equals("New York")) {
			return price*1.0852;
		} else return price;
	}

	public double splitTheChecks(double total, int people) {
		return total*1.2/people;
	}

	public String pickDestination(String a, String b, String c) {
		Random rn = new Random();
		int x = rn.nextInt(3) + 1;
		if (x==1) {
			return a;
		} else if (x==2) {
			return b;
		} else {
			return c;
		} 
	}
}
