package day5.oop2;

public class Point2D {
	int x;
	int y;

	public Point2D() {
		int x = 100;
		int y = 200;
		System.out.println("Point2D() 실행");
	}


	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y) 실행");
	}

}
