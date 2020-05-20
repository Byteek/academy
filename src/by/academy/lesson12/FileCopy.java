package by.academy.lesson12;

//Переписать класс FileCopy: 

//a) Добавить блок try-with-resources. 
//б) Добавить catch блок для обработки IOException. (Задание с урока)

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		String path = "src\\io\\file.txt";
		String path2 = "src\\io\\copied_file.txt";

		try (FileInputStream fileIn = new FileInputStream(path);
				FileOutputStream fileOut = new FileOutputStream(path2)) {

			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);
			}
		} catch (IOException e) {
			System.err.println("exception");
		}
	}
}
