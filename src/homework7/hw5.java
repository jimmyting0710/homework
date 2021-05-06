package homework7;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;


public class hw5 {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\data\\Object.ser");

		try {

			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(file.getName() + "檔案內容如下: ");
			System.out.println("--------------------");
			try {
				while (true) {
					((Animal) ois.readObject()).speak();
					;
					System.out.println("--------------------");
				}
			} catch (EOFException e) {
				System.out.println("資料讀取完畢！");
			}
			ois.close();
			fis.close();

		} catch (IOException e) {
		}
	}
}
