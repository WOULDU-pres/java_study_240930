package day5.oop;

public class PointTest {
	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.setX(100);
		pt.setY(100);
		pt.setZ(100);
		System.out.println("x = " + pt.getX());
		System.out.println("y = " + pt.getY());
		System.out.println("z = " + pt.getZ());
	}
}
