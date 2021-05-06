package homework5;

public class h2 {
	public void randAvg() {
		int sum = 0;
		int[] data = new int[10];
		for (int i = 0; i < 10; i++) {

			data[i] = (int) (Math.random() * 100);
			System.out.print(data[i]+" ");
			sum +=data[i];
		}
		System.out.println();
		System.out.println("¥­§¡­È"+sum/data.length);
		
	}
}
