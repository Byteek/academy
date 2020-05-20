package by.academy.lesson12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileCopy {

	private File file1;
	private File file2;

	public MyFileCopy() {

	}

	public void copyFile(File file1, File file2) throws IOException {
		this.file1 = file1;
		this.file2 = file2;
		try (BufferedReader readerFile1 = new BufferedReader(new FileReader(file1));
				BufferedWriter writerFile2 = new BufferedWriter(new FileWriter(file2))) {

			while (readerFile1.ready()) {
				writerFile2.write(readerFile1.readLine() + "\r\n");
			}

		}

	}

}
