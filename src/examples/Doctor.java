package examples;

public class Doctor {
	String name;
	int age;

	public Doctor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void doMedicine() {
		System.out.println("Hello, my name is " + this.name + ".I am " + this.age + " years old and I am A doctor");
	}

}
