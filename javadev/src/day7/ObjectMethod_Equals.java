package day7;


class A {

	String name;
	A(String name) {
		this.name = name;
	}
}

class B {

	String name;
	B(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
			
		} else return true;
	}
}

public class ObjectMethod_Equals {
	public static void main(String[] args) {

	}
}
