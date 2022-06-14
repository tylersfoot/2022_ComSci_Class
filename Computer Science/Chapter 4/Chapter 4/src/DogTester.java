public class DogTester {

	public static void main(String[] args) {

		Dog brodysDog = new Dog("Buddy", "Golden doodle", "Best family");
		Dog gavinsDog = new Dog("Cappy", "Chihuahua", "Ramins family");
		Dog kiansDog = new Dog("Dudley", "Pug", "Adams family", "M", 5, 25);

		brodysDog.greetDog();
		gavinsDog.greetDog();
		kiansDog.singHappyBirthday();
		kiansDog.gainWeight();
		System.out.println(brodysDog.getWeight());
		brodysDog.setWeight(89);
		System.out.println(brodysDog.getWeight());
		System.out.println(brodysDog.getAge());
		brodysDog.setAge(10);
		System.out.println(brodysDog.getAge());
		kiansDog.setWeight(23);
		System.out.println(gavinsDog.getAge());
		gavinsDog.singHappyBirthday();
		System.out.println(gavinsDog.getAge());
		
		System.out.println(kiansDog.toString());
		System.out.println(brodysDog.toString());
		System.out.println(gavinsDog.toString());
	}

}