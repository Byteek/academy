package by.academy.lesson9;

public class Main {

	public static void main(String[] args) {

		String login = "IAMUSER";
		String password = "qwerty";

		User user = new User(login, password);
		user.createQuery();

		User.Query userQuery = user.new Query();
		userQuery.printToLog();

		new User(login, password).new Query().printToLog();

		System.out.println("---------------------------");

		String loginUserLocal = "IAMUSERLOCAL";
		String passwordUserLocal = "123456";

		UserLocal userLocal = new UserLocal(loginUserLocal, passwordUserLocal);
		userLocal.createQuery();

	}

}
