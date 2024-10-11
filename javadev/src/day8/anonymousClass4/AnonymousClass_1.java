package day8.anonymousClass4;

interface A {
	public abstract void abc();
}

class B implements A {
	public void abc() {
		System.out.println("입력 매개변수 전달");
	}
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_1 {
	public static void main(String[] args) {
		C c = new C();
		A a = new B();
		c.cde(a);
		
		c.cde(new B());
		
		A a2 = new A() {
			public void abc() {
				System.out.println("입력매개변수 전달2");
			}
		};
		c.cde(a2);
		c.cde(new A() {
			public void abc() {
				System.out.println("입력 매개변수 전달2");
			}
		});
	}
}
