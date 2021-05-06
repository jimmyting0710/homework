package homework7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class hw2 {

	public static void main(String[] args) {
		int r;
		try {
			FileOutputStream fos = new FileOutputStream("c:\\javawork\\Data.txt");

			BufferedOutputStream bos = new BufferedOutputStream(fos);

			PrintStream ps = new PrintStream(bos);

			for (int i = 0; i < 10; i++) {
				r = ((int) (Math.random() * 1000) + 1);
				String a = Integer.toString(r);
				ps.append(a + " ");
			}

			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
