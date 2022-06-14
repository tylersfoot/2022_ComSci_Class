public class Dog {

	// Create instance variables. Always mark them private!
	// This ensures that the instance variables can only be seen
	// and modified from inside this class.
	public String ZodiacKillerYesorNo;
	private String name;
	private String breed;
	private String owner;
	private String sex;
	private int age;
	private double weight;

	// Constructor: sets up initial values of instance variables
	public Dog (String dogName, String dogBreed, String dogOwner) {
		name = dogName;
		breed = dogBreed;
		owner = dogOwner;
	}
	// Overloading the constructor with a second template
	// specified all of the instance variables
	public Dog (String dogName, String dogBreed, String dogOwner, String dogSex, int dogAge, double dogWeight) {
		name = dogName;
		breed = dogBreed;
		owner = dogOwner;
		sex = dogSex;
		age = dogAge;
		weight = dogWeight;
	}
	// Create some methods for use on Dog objects
	public void greetDog() {
		System.out.println("Hi " + name);
	}
	public void singHappyBirthday() {
		System.out.println("Happy birthday to you!");
		System.out.println("Happy birthday to you!");
		System.out.println("Happy birthday dear " + name + "!");
		System.out.println("Happy birthday to you!");
		age++;
	}

	public void gainWeight() {
		weight+=200;
	}
	
	public void setName(String newName) {
		name = newName;
	}

	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setWeight(double newWeight) {
		weight = newWeight;
	}
	
	public void setOwner(String newOwner) {
		owner = newOwner;
	}
	
	public String getName() {
		return name;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String toString() {
		return name+"\t"+breed+"\t"+owner+"\t"+sex+"\t"+age+"\t"+weight;
	}
	
}