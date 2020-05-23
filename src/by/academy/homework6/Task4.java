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
		String fromWrite;
		int sizeText;
		File dir = new File("C://Users//bytee//eclipse-workspace//academyCourses//src//by//academy//homework6//",
				"FromTask4");
		dir.mkdir();
		BufferedReader br = new BufferedReader(new FileReader(
				"C://Users//bytee//eclipse-workspace//academyCourses//src//by//academy//homework6//FirstFile.txt"));
		textOfFile = br.readLine();
		for (int i = 0; i < 100; i++) {
			File newFile = new File(dir, (i + ""));
			newFile.createNewFile();
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
				bw.write(textOfFile.substring((int) (Math.random() * textOfFile.length())));
			}
		}

	}

}
