package day2;

public class VariableDeclaration {
	// field 변수
	int x = 10;
	
	public static void main(String[] args) {
		// local 변수
		int a = 5;
		int b;
		b = 4;
		
		System.out.println(a);
		System.out.println(b);
		
		int _a = 10;
		int __a = 10;
		System.out.println(_a);
		System.out.println(__a);		

		{
			int x = 3;
			System.out.println(x);
		}

	}

}
