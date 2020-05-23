package by.academy.homework6;

public class User {

	private String name;
	private String soName;
	private int age;

	public User() {

	}

	public User(String name, String soName, int age) {
		super();
		this.name = name;
		this.soName = soName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoName() {
		return soName;
	}

	public void setSoName(String soName) {
		this.soName = soName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
