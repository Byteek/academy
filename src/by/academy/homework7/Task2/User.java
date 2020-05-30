package by.academy.homework7.Task2;

//b)	Добавить класс User, который наследуется от Person, с полями: login, password, email

public class User extends Person {
	private String login;
	private String password;
	private String email;

	public User() {

	}

	public User(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password,
			String email) {
		super(firstName, lastName, age, dateOfBirth);
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public void printUserInfo() {
		System.out.println(login + " " + email);
	}

	private void printUserInfoPrivate() {
		System.out.println("login" + " " + email + " " + password);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
