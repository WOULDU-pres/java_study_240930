package day3;

import java.util.Scanner;

public class Loop_Numbergame2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int s, b;
		
		int h1, h2, h3;
		int c1, c2, c3;
		int count = 0;
		
		
		c1 = (int) (Math.random() * 10);
		do {
			c2 = (int) (Math.random() * 10);
		} while (c1 == c2);
		do {
			c3 = (int) (Math.random() * 10);
		} while (c1 == c3 || c2 == c3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		 
		do {
			s = b = 0;
			System.out.println("0~9사이 중복되지 않은 숫자 3개 입력 >> ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			if (h1 == c1) s++;
			else if(h1 == c2 || h1 == c3) b++;
			
			if (h2 == c2) s++;
			else if(h2 == c1 || h2 == c3) b++;
			
			if (h3 == c3) s++;
			else if(h3 == c1 || h3 == c2) b++;
			
			System.out.println("[" + s + "S " + b + "B]");
			count++;
			
		} while(s != 3);
		System.out.println("축하! "+count + "번 만에 성공하셨음!");
	}
}
