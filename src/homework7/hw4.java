package homework7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class hw4 {
	public static void main(String[] args) {
		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdir();
		}
		try {

			File file = new File("C:\\data\\Object.ser");
			Animal[] an = new Animal[4];
			an[0] = new Cat("c");
			an[1] = new Cat("cc");
			an[2] = new Dog("d");
			an[3] = new Dog("dd");

			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (int i = 0; i < an.length; i++)
				oos.writeObject(an[i]);
			oos.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
