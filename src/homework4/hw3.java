package homework4;

public class hw3 {
	public static void main(String[] args) {
		int w=0;
		String Array[]= {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		for(int i=0;i<Array.length;i++) {
			for (int j=0;j<Array[i].length();j++) {
				char x=Array[i].charAt(j);
//				System.out.println(x);
			if(x=='a') {
				w=w+1;
			}else if (x=='e'){
				w=w+1;
			}else if (x=='i'){
				w=w+1;
			}else if (x=='o'){
				w=w+1;
		
			}else if (x=='u'){
				w=w+1;
			}
		
		}
		}
			System.out.println(w);
	}
}
