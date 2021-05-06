package homework7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class hw3 {
	public static void main(String[] args) {
		File inputFile = new File("c:\\javawork\\Data.txt");
		File outputFile = new File("c:\\javawork\\Datab.txt");

		FileReader in;
		try {
			in = new FileReader(inputFile);
		
		
		FileWriter out = new FileWriter(outputFile);
		int c;

		while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
			out.write(c);
			System.out.print((char) c);
			System.out.flush();
		}

		in.close();
		out.close();
		} catch (Exception e) {
			e.printStackTrace();
			}
	}
}
