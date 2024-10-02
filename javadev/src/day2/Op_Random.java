package day2;

public class Op_Random {
	public static void main(String[] args) {
		
	// a 는 0.0 <= x < 1.0
	double a = Math.random();
	
	// 주사위 랜덤 값을 만들어봅니다.
	a = (int)(a * 6) + 1;
	
	System.out.println(a);
	
	
	}
}
