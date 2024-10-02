package day2;

public class Op_Exercise2 {
	public static void main(String[] args) {
		
	// a 는 0.0 <= x < 1.0
	double a = Math.random();	
	a = (int) (a * 12) + 4;
	System.out.print("number range in 4~15 : ");
	System.out.println(a);
	
	
	a = Math.random();	
	a = (int)(a * 18) + 6;
	System.out.print("number range in 600 ~ 2300 : ");
	System.out.println(a * 100);
	}
}
