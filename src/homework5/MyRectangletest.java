package homework5;

public class MyRectangletest {
	public static void main(String[] args) {
		MyRectangle a =new MyRectangle(10,20);
		System.out.println(a.getArea());
		
		MyRectangle b=new MyRectangle();
		b.setWidth(10);
		b.setDpeth(20);
		System.out.println(b.getArea());
	}
}
