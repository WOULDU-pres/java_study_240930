package day6.oop8;

class RefMe extends Object {
	public RefMe() {
		System.out.println("인스턴스 생성");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("인스턴스 완전 삭제");
	}
}

public class XCIGcTest {
	public static void main(String[] args) {
		RefMe r1 = new RefMe();
		RefMe r2 = r1;
		r1 = null;
		System.gc();
		r2 = null;
		System.gc();
		System.out.println("종료");
	}
}