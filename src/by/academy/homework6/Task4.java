package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {

	public static void main(String[] args) throws IOException {
		String textOfFile;
		StringBuilder sb = new StringBuilder();
		File dir = new File("C://Users//bytee//eclipse-workspace//academyCourses//src//by//academy//homework6//",
				"FromTask4");

		dir.mkdir();
		try (BufferedReader br = new BufferedReader(new FileReader(
				"C://Users//bytee//eclipse-workspace//academyCourses//src//by//academy//homework6//FirstFile.txt"))) {
			textOfFile = br.readLine();
		}

		File result = new File(dir.getParent(), "resultFromTask4.txt");
		result.createNewFile();

		for (int i = 0; i < 100; i++) {
			File newFile = new File(dir, (i + ".txt"));
			newFile.createNewFile();
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
				bw.write(textOfFile.substring((int) (Math.random() * textOfFile.length())));
			}
		}
		String[] text = dir.list();
		File[] files = dir.listFiles();

		for (int i = 0; i < text.length; i++) {
			sb.append(files[i].getName() + "   Размер файла - " + files[i].length() + " байт." + "\r\n");
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(result))) {
			bw.write(sb.toString());
		}
	}

}
