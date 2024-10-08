package day5;

public class Method_Test1 {
	public static void main(String[] args) {
		print();
		print("SPOTLIGHT");

		int i = 10, j = 5;
		int add = add(i,j);
		System.out.println(add);
		System.out.println("end");
	}
	
	// 메소드

	private static void print() {
		System.out.println("-------");
		System.out.println(" SESAC ");
		System.out.println("-------");

	}

	// 메소드 오버로딩

	private static void print(String str) {
		System.out.println("-------");
		System.out.println(" " + str);
		System.out.println("-------");

	}
	

	private static int add(int i, int j) {
		int t = i + j;
		return t;
	}
}
