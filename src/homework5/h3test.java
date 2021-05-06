package homework5;



public class h3test {
	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		h3 aa = new h3() ;
		System.out.println(aa.me(intArray));
		System.out.println(aa.me(doubleArray));
	}
}
