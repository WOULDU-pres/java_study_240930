package day7;

abstract class Abstract_A {
	abstract void abc();
}

class Abstract_B extends Abstract_A {
	void abc() {
		System.out.println("방법 1. 자식 클래스 생성 및 추상 메서드 구현");
	}
}

public class AbstractClass_1 {
	public static void main(String[] args) {
		Abstract_A b1 = new Abstract_B();
		Abstract_B b2 = new Abstract_B();
		
		b1.abc();
		b2.abc();
	}
}
