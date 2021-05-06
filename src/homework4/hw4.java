package homework4;

import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("要借多少");
	Scanner sc=new Scanner(System.in);
	int array[][]= {{25,32,8,19,27},{2500,800,500,1000,1200}};
	int a =sc.nextInt();
		for(int i=0;i < array[1].length;i++) {
//			System.out.println(array[1][i]);
			if(a<=array[1][i]) {
				sum=sum+1;
				System.out.println("有"+array[0][i]+"可以借");
			}
		}
		System.out.println("共"+sum+"人");
	}
}
