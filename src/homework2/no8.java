package homework2;

public class no8 {
	public static void main(String[] args) {

//		int intArray[][];
//		for (int i = 0; i < intArray.length; i++) {
//			for (int j = 0; j < intArray[i].length; j++) {
//				int r = (int) (Math.random() * 30) + 1;
//				System.out.println(r);
//				// intArray += r;
//			}
//		}

	}

	public void pp(int x,int y) {
		int[][] intArray=new int[3] [3];
		int z=0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
//				int r = (int) (Math.random() * 30) + 1;
//				System.out.println(r);
				z += intArray[i][j];
				System.out.println(z);
	}
		}
	}
}
