package day5.oop2;

public class PointTest {
	public static void main(String[] args) {

		Point2D pt1 = new Point2D();
		System.out.println("x = "+pt1.x);
		System.out.println("y = "+pt1.y);
		
		Point2D pt2 = new Point2D(1000, 2000);
		System.out.println("x = "+pt2.x);
		System.out.println("y = "+pt2.y);
	}
}
