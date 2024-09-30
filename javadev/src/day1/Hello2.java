package day1;

/*
 * 켈리 방정식 테스트
 * 2024-09-30
 */

public class Hello2 {

	public static void main(String[] args) {

		double money = 1_000_000;
		
		
		for(int i=1; i<=50; i++) {
			money = money * 1.4;			
			money = money * 0.7;
			
			System.out.println(money);
		}
	}

}
