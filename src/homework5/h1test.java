package homework5;

import java.util.Scanner;

public class h1test {
	public static void main(String[] args) {
		int width,height;
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J���諬���e");
		width=sc.nextInt();
		System.out.println("�п�J���諬����");
		height=sc.nextInt();
		h1 e=new h1();
		e.starSquare(width, height);
	}
}	
