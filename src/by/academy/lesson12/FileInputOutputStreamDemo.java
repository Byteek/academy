package by.academy.lesson12;

import java.io.BufferedWriter;
import java.io.File;

//Переписать класс FileInputOutputStreamDemo: 
//	a) Добавить блок try-with-resources. 
//	б) Замените for (int i = 0; i < c.length; i++) на блок for-each.  
//	в) Пусть file.txt записывается в каталог src/io. (Задание с урока)

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) throws IOException {

		File dir = new File("srcNew");
		if (!dir.exists()) {
			dir.mkdir();
		}
		File dir2 = new File(dir, "io");
		if (!dir2.exists()) {
			dir2.mkdir();
		}
		File txt = new File(dir2, "file.txt");
		if (!txt.exists()) {
			txt.createNewFile();
		}

		try (OutputStream output = new FileOutputStream("a.txt"); InputStream input = new FileInputStream(txt)) {

			char[] symbols = { 'a', 'b', 'c', 'd' };

			for (char i : symbols) {
				output.write(i);
			}

			int size = input.available();

			for (int i = 0; i < size; i++) {
				// Чтение текстового файла посимвольно
				System.out.print((char) input.read() + " ");
			}

		} catch (IOException e) {
			System.err.print("Exception");
		}
	}
}
