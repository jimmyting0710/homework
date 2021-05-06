package homework4;

import java.util.Scanner;

public class hw5 {
	public static void main(String[] args) {
		
		int array[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc=new Scanner(System.in); 
		System.out.println("輸入西元年");
		int y=sc.nextInt();
		System.out.println("輸入幾月");
		int m=sc.nextInt();
		int d =0;
		int sum=0;
		
		if (m != 2) {
			System.out.println("輸入幾號");
			d=sc.nextInt();
		}else {
			System.out.println("1輸入幾號");
			d=sc.nextInt();
		
			if (d>28) {
				System.out.println("2月只有28天");
				System.out.println("從新輸入幾號");
				d=sc.nextInt();
			
			}else {
				
			}
		}
//		System.out.println(y+m+d);
		if(y%4==0 && m>2) {
			for(int i=0;i<m-1;i++) {
				sum=sum+array[i];
				
			}
			sum=sum+1;
		}else if(y%4==0 && m<=2)
			for(int i=0;i<m-1;i++) {
				sum=sum+array[i];
		}else {
			for(int i=0;i<m-1;i++)
				sum=sum+array[i];
		}
		System.out.println(sum+d );	
		
		
		
		
		
		
	}
}
