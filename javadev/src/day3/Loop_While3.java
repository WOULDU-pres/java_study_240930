package day3;

public class Loop_While3 {
	public static void main(String[] args) {
		// 1부터 1000까지의 3의 배수의 합계
		int sum =0;
		int i = 1;
		do {	
			sum += 3*i;
			i++;
		} while (3*i <=1000);
		System.out.println(sum);
		System.out.println("종료");
				
	}
}
