package homework4;

public class hw6 {
	public static void main(String[] args) {
		
		int array[][] = {   { 10, 35, 40, 100, 90, 85, 75, 70 },
							{ 37, 75, 77, 89, 64, 75, 70, 95 },
							{ 100, 70, 79, 90, 75, 70, 79, 90 },
							{ 77, 95, 70, 89, 60, 75, 85, 89 },
							{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
							{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		
		int high=0;
		int count1[] = new int[8];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
//				System.out.print (array[i][j]+"  ");
				int count=0;
				for (int k =0 ; k < 8; k++) {
					if (array[i][j] > array[i][k]) {
						count = count + 1;
						if (count == 7) {
							high = j;
							count1[high] += 1;
						}

					}
				}
			}

		}
//			System.out.println();
		for (int l=0;l<count1.length;l++) {
		System.out.println((l+1)+"號同學考最高分次數="+count1[l]);
		}
	}

}
