package homework6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {
		int xx, yy;	
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		while (true) {
			try {

				System.out.println("�п�Jx����");
				boolean x = sc.hasNextInt();
				if (x == true) {
					xx = sc.nextInt();
				} else {
					throw new CalException("�榡�����T");
				}
				System.out.println("�п�Jy����");
				boolean y = sc.hasNextInt();
				if (y == true) {
					yy = sc.nextInt();
				} else {
					throw new CalException("�榡�����T");
				}

//			if(x==true && y==true) {

				if (xx == 0 && yy == 0) {
					throw new CalException("0��0����S���N�q");
				} else if (yy < 0) {
					throw new CalException("���謰�t�ơA�^�Ǥ������");
				} else {
				
					
					double po = cal.powerXY(xx, yy);
				
					System.out.println(po);
					break;
				}

			} catch (Exception se) {
				System.out.println("���~");
				se.printStackTrace();
			}
		}
	}

}
