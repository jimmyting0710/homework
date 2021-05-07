package homework2;

public class testninenine {
	public static void main(String[] args) {

//	
	//方法一
//	int i, j  ;
//	for(i=1; i<=9; i++) {
//		j=1;
//		while(j<=9) {
//			System.out.print(i + "*" + j + "=" + i * j + "\t");
//			j++;
//		}
//		System.out.println();
//	}
	
	
//	    //方法二
//		int i, j  ;
//	    for(i=1; i<=9; i++) {
//		   j=1;
//		do {
//			System.out.print(i + "*" + j + "=" + i * j + "\t");
//		    j++;	
//		}while(j<=9);
//		System.out.println();		
//	}
	    
	    
	//方法三
	int i = 1;
    int j;
	while(i<=9) {
		 j=1;
		do {				   
			System.out.print(i + "*" + j + "=" + i * j + "\t");
		    j++;	
		}while(j<=9);
		i++ ;
		System.out.println();	
	}








}
}
