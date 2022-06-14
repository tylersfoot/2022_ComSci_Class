public class Relative {

	private String name;
	private String relation;
	private String hometown;
	private int age;
	private int height;

	public Relative (String relativeName, String relativeRelation, String relativeHometown) {
		name = relativeName;
		relation = relativeRelation;
		hometown = relativeHometown;
	}
	
	public Relative (String relativeName, String relativeRelation, String relativeHometown, int relativeAge, int relativeHeight) {
		name = relativeName;
		relation = relativeRelation;
		hometown = relativeHometown;
		age = relativeAge;
		height = relativeHeight;
	}
	
	public void setName(String newName) { name = newName; }
	public void setRelation(String newRelation) { relation = newRelation; }
	public void setHometown(String newHometown) { hometown = newHometown; }
	public void setAge(int newAge) { age = newAge; }
	public void setHeight(int newHeight) { height = newHeight; }
	
	public String getName() { return name; }
	public String getRelation() { return relation; }
	public String getHometown() { return hometown; }
	public int getAge() { return age; }
	public int getHeight() { return height; }
	
	public String toString() {
		return name+"\t"+relation+"\t"+hometown+"\t"+age+"\t"+height;
	}
	
}