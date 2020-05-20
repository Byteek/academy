package by.academy.lesson12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
//		LinkedListNode test = new LinkedListNode();
//		test.addRandomList(20);
//		
//		Iterator it = test.iterator();
//		
//		for (int i = 0 ; i < 10; i++) {
//			System.out.print(it.next() + " ");
//		}
//		
//		test.removeDuplicates(test);
//		
//		Iterator itRem = test.iterator();
//		for (int i = 0 ; i < 10; i++) {
//			System.out.print(itRem.next() + " ");
//		}
		String text = "Бла бла бла, я записываюсь в файл \r\nDa ya takoi ";
		File file1 = new File("txt.txt");
		File file2 = new File("copyTxt.txt");
		try (BufferedWriter write = new BufferedWriter(new FileWriter(file1));) {
			write.write(text);
		}
		MyFileCopy copy = new MyFileCopy();
		copy.copyFile(file1, file2);

		String path = "src";

		packageContents(path);

	}

	public static void packageContents(String path) {
		File file = new File(path);
		if (file.isDirectory()) {

			for (File i : file.listFiles()) {
				if (i.isDirectory()) {
					System.out.println(i.getName() + " folder");
					packageContents(i.getPath());
				} else {
					System.out.println(i.getName() + " file");
				}
			}

		}
	}

}
