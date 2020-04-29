package by.academy.lesson9;

//	Создать класс User, содержащий private переменные login, password. 
//	Создать внутренний класс Query в классе User. 
//	Класс Query содержит метод printToLog(), который распечатывает на консоль 
//	сообщение о том что пользователь с таким то логином и паролем отправил запрос. 
//	Класс User, содержит метод createQuery(), в котором создается объект класса 
//	Query и вызывается метод printToLog(). В методе main(): создать экземпляр класса 
//	User и вызвать метод createQuery(); создать экземпляр класса Query и вызвать метод 
//	printToLog() используя конструкцию user.new Query(); создать экземпляр класса 
//	Query и вызвать метод printToLog() используя конструкцию new User().new Query(); 

public class User {

	private String login;
	private String password;
	
	
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}
	
	class Query {
		
		void printToLog() {
			System.out.println("Пользователь с логином - " + login + " и паролем - " + password + " отправил запрос.");
			
		}
		
	}
	
}
