package day2;

import java.util.Scanner;

public class Op_Exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String result = (x%2 == 0) ? "even number" : "odd number";
		System.out.println("result : " + result);
		
		x = sc.nextInt();
		String gender = (x == 1 || x == 3) ? "man" : ((x == 2 || x ==4) ? "woman" : "error");
		System.out.println("gender : " + gender);
		
	}

}
