public class RelativeTester {

	public static void main(String[] args) {

		Relative matt = new Relative("Matt", "Friend", "Lacey", 17, 69);
		
		System.out.println(matt.getAge());
		matt.setAge(18);
		System.out.println(matt.getAge());
//		System.out.println(brodysDog.getAge());
//		brodysDog.setAge(10);
//		System.out.println(brodysDog.getAge());
//		kiansDog.setWeight(23);
//		System.out.println(gavinsDog.getAge());
//		gavinsDog.singHappyBirthday();
//		System.out.println(gavinsDog.getAge());
		
		System.out.println(matt.toString());
	}

}