package homework5;

public class h3 {
	public int me(int[][] m) {
		int max = -1;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > max) {
					max = m[i][j];
				}
			}
		}
		return max;
	}

	public  double me(double[][] m) {
		double max = -1;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > max) {
					max = m[i][j];
				}
			}
		}
		return max;
	}

}
