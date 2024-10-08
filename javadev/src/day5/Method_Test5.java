package day5;

public class Method_Test5 {
	
	public static void main(String[] args) {
		print(1);
		print(2,3);
	}

	private static void print(int... i) {
		for (int j:i) System.out.println(j);
	}
}
