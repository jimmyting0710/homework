package homework4;

import java.util.Arrays;

public class hw1 {
	public static void main(String[] args) {
		int sum=0;
		int av =0;
		int intArray[]= {29,100,39,41,50,8,66,77,95,15};
		for(int i=0;i< intArray.length;i++) {
			 sum =sum + intArray[i];
//			 System.out.println(sum);
		}
			av= sum / intArray.length;
			System.out.println("平均值="+av);
			
		Arrays.sort(intArray);
			for(int i=0;i< intArray.length;i++) {
				if (intArray[i]> av) {
				System.out.println(intArray[i]);
				}
			}
	}
}
