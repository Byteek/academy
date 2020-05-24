package by.academy.homework6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserDemo {

	public static void main(String[] args) throws IOException {
		File userFile;
		User user1 = new User("Погодский", "Никита", 23);
		User user2 = new User("Шкурко", "Денис", 21);
		User user3 = new User("Слесарев", "Валентин", 23);
		User user4 = new User("Миклашевич", "Никита", 23);
		User user5 = new User("Кеда", "Игнат", 23);
		User user6 = new User("ЖанКлод", "ВанДам", 23);
		User user7 = new User("Джобс", "Стив", 23);
		User user8 = new User("Гейтс", "Бил", 23);
		User user9 = new User("Бонд", "Джеймс", 23);
		User user10 = new User("Бандитка", "Даша", 23);

		ArrayList<User> userList = new ArrayList<User>();

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		userList.add(user6);
		userList.add(user7);
		userList.add(user8);
		userList.add(user9);
		userList.add(user10);

		File dirFromUser = new File(
				"C://Users//bytee//eclipse-workspace//academyCourses//src//by//academy//homework6//", "AllUsers");
		dirFromUser.mkdir();

		for (int i = 0; i < userList.size(); i++) {
			userFile = new File(dirFromUser, (userList.get(i).getName() + "_" + userList.get(i).getSoName() + ".txt"));
			userFile.createNewFile();

			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userFile))) {
				oos.writeObject(userList.get(i).getName());
				oos.writeObject(userList.get(i).getSoName());
				oos.writeObject(userList.get(i).getAge());
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
			}
		}

	}

}
