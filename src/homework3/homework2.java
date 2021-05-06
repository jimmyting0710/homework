package homework3;
import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		int a;
		int i;
		
		do {
			System.out.println("請猜數字");
			Scanner sc =new Scanner(System.in);
			a = sc.nextInt();
			i=(int)(Math.random()*10);
			if(i==a) {
				System.out.println("答對了!答案就是"+ i);
				break ;
			}else {
				System.out.println("答錯了");
			}
		} while(i!=a);
//		do {
//			System.out.println("請猜數字");
//			Scanner sc =new Scanner(System.in);
//			a = sc.nextInt();
//			i=(int)(Math.random()*101);
//			if(i==a) {
//				System.out.println("答對了!答案就是"+ i);
//				break ;
//			}else {
//				if(a>i) {
//				System.out.println("答錯了!答案比較小");
//				}else {
//					System.out.println("答錯了!答案比較大");
//				}
//			}	
//		} while(i!=a);
	}
}
