package by.academy.lesson9;

import by.academy.lesson9.User.Query;

public class UserLocal {

	private String login;
	private String password;

	public UserLocal(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public void createQuery() {
		class Query {

			public void printToLog() {
				System.out.println(
						"Пользователь с логином - " + login + " и паролем - " + password + " отправил запрос.");

			}
		}
		Query query = new Query();
		query.printToLog();

	}
}
