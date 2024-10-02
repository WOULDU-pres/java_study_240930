package day3;

import java.util.Scanner;

public class ConditionalStatements_Exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("score > ");
		int score = sc.nextInt();
					
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
				
		}
		
		switch(score/10) {
			case 10,9 -> System.out.println("A");
			case 8 -> System.out.println("B");
			case 7 -> System.out.println("C");
			case 6 -> System.out.println("D");
			default -> System.out.println("F");				
		}
	}
}
