package day7;


class A_toString {
	int a = 3;
	int b = 4;
	
//	public String toString() {
//		return "필드값 (a,b) = " + a + " " + b;
//	}
}


class B_toString extends A_toString {
	int a = 3;
	int b = 4;
	
	public String toString() {
		return "필드값 (a,b) = " + a + " " + b;
	}
}

public class ObjectMethod_toString {
	public static void main(String[] args) {
		A_toString a = new A_toString();
		B_toString b = new B_toString();
		
		System.out.printf("%x\n", a.hashCode());
		System.out.println(a.toString());
		System.out.println(b);
	}
}
