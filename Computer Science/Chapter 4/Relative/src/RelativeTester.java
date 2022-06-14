public class RelativeTester {

	public static void main(String[] args) {

		Relative matt = new Relative("Matt", "Friend", "Lacey", 17, 69);
		
		System.out.println(matt.getAge());
		matt.setAge(18);
		System.out.println(matt.getAge());
		
		System.out.println(matt.toString());
	}

}