package test;

public class homework5 {
	public static void main(String[] args) {
		int money = 1500000 ;
		double fr = 0.02;
	    int year=1;
	    double totle=0;
	    	while(year<=10) {
//	    	  System.out.println(z);
//	    	  z++;
	    	  totle=money * Math.pow(1+fr, year++);
	        }
	    System.out.printf("本金加利息為%.2f%n",totle);
	}
}
//期末 = 期初*(1+利率)的n次方
//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//金加利息共有多少錢 


