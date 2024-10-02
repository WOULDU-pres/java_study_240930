package day2;

import java.util.Scanner;

public class Op_Operator {
	public static void main(String[] args) {
		// System.in -> 키보드 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a : ");
		int a = sc.nextInt();
		
		System.out.println("b : ");
		int b = sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a+b));
		System.out.println(a + "-" + b + "=" + (a-b));
		System.out.println(a + "*" + b + "=" + (a*b));
		System.out.println(a + "/" + b + "=" + ((double)a/b));
		System.out.println(a + "%" + b + "=" + (a%b));
		System.out.println("End");
			
		
	}
}
