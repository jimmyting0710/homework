package homework3;
import java.util.Scanner;
public class homework1 {


	public static void main(String[] args) { 
		int num1,  num2, num3;
		System.out.println("請輸入三個整數:");
		Scanner sc=new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1<num2+num3 && num2<num1+num3 && num3<num1+num2 ) {
			if(num1 == num2 && num2 == num3 ) {
				System.out.println("正三角型");
//			}else if (num1*num1+num2*num2==num3*num3) {
//				System.out.println("直角三角型");
			}
			else if(num1==num2 || num2==num1 || num3==num1) {	
				System.out.println("等腰三角型");
			}else {
				System.out.println("其他三角型");
			}
		}
		else {
			System.out.println("不是三角型");
		}
		
		
	}
	
	
	
}
