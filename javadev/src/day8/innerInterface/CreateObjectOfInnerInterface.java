package day8.innerInterface;

class A {
	interface B{
		public abstract void bcd();
	}
}

class C implements A.B{
	public void bcd() {
		System.out.println("Create inner interface implements class ");
	}
}

public class CreateObjectOfInnerInterface {
	public static void main(String[] args) {
		A.B ab = new C();
		ab.bcd();
		C c =new C();
		c.bcd();
		A.B b = new A.B() {
			public void bcd() {
				System.out.println("Create anonymous inner class object");
			}
		};
		b.bcd();
	}
}