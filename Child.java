package myperson;


public class Child extends Person{

	private String school;

	public Child(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	@Override
	public String toString() {
		return "Child [school=" + school + "]";
	}
	
	
	
	
}
