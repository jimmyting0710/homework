package homework6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {
		int xx, yy;	
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		while (true) {
			try {

				System.out.println("請輸入x的值");
				boolean x = sc.hasNextInt();
				if (x == true) {
					xx = sc.nextInt();
				} else {
					throw new CalException("格式不正確");
				}
				System.out.println("請輸入y的值");
				boolean y = sc.hasNextInt();
				if (y == true) {
					yy = sc.nextInt();
				} else {
					throw new CalException("格式不正確");
				}

//			if(x==true && y==true) {

				if (xx == 0 && yy == 0) {
					throw new CalException("0的0次方沒的意義");
				} else if (yy < 0) {
					throw new CalException("次方為負數，回傳不為整數");
				} else {
				
					
					double po = cal.powerXY(xx, yy);
				
					System.out.println(po);
					break;
				}

			} catch (Exception se) {
				System.out.println("錯誤");
				se.printStackTrace();
			}
		}
	}

}
