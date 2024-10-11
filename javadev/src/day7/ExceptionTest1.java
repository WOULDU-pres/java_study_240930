package day7;

public class ExceptionTest1 {
	public static void main(String[] args) {
		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");

		try {
			Class.forName("java.lang.Object1");
		} catch (Exception e) {
			System.out.println("잘못됨");
		}

	}
}
