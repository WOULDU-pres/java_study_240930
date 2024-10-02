package day3;

public class Loop_For3 {
	public static void main(String[] args) {
		// 1부터 3까지 정수의 합계
		int sum = 0;
		for(int i=1; i<3; i++) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("종료");
		
		// 1부터 1000까지의 3의 배수의 합계
		sum =0;
		for(int i=1; 3*i <=1000; i++) {
			sum += 3*i;
		}
		System.out.println(sum);
		System.out.println("종료");
				
	}

}
