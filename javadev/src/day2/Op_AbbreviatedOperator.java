package day2;

public class Op_AbbreviatedOperator {
	public static void main(String[] args) {
		int a = 10;
		
		int t;

		t = a++; // 먼저 a값을 t에 저장, 이후 a값을 1 증가 시킴
				 /* 1.  t = a;
				  * 2.  a = a+1;
				  */
		System.out.println("t = " + t); 
		System.out.println("a = " + a); 
		
		t = ++a; // 먼저 a값을 t에 저장, 이후 a값을 1 증가 시킴
				 /* 1.  a = a+1;
				  * 2.  t = a;
				  */
		System.out.println("t = " + t); 
		System.out.println("a = " + a); 		
	}

}
