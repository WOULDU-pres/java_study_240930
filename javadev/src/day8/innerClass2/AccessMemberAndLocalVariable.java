package day8.innerClass2;

class A {
	int a = 3;

	void abc() {
		final int b = 5;
		class B {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
				// b = 7; // 에러발생 (inner class가 참조하는 지역변수는 무조건 final이어야함)
			}
		}
		B bb = new B();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}
