package homework3;

import java.util.Scanner;

public class homework3 {
	public static void main(String[] args) {
		int x;
		int y=0;
//		int z =0;
		System.out.println("1到9請輸入不要的數字");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		
		for(int i=1; i<=49;i++) {
		   if(i%10==x || i/10==x) {
		   }else {
			   y++;
			   System.out.print(i+"\t");
			   if(y%6==0) {
				   System.out.println();
			
			
			   
			   }
			   
		   }
		   
		   
		}
		System.out.print("總共有"+y);
	
//			   z=(int)(Math.random()*y)+1;
//			   int d=0;
//			   int q=0;
//			   
//			   int[] arr=new int[y];
//		       q++;
//			   arr[q]=z;
//			   do{
//				   x=z % 10 ; 
//				   x=z / 10;
//			   System.out.println(z);
//			    d++;
//			   } while(d>6);
//			   
//			   
//		   
//		
		
	}
}
