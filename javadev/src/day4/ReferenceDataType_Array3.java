package day4;

import java.util.Arrays;
import java.util.Scanner;

public class ReferenceDataType_Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] keywords = {
			"oop", "primitive type", "java", "james gosling", "for", "while", "do while", "continue", "break", "Scanner"
		};
		
		int[] item = new int[3];
		for(int i=0; i< item.length; i++) {
			item[i] = (int) (Math.random() * keywords.length);
			for (int j = 0; j<i; j++) {
				if(item[i] == item[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(item));
		
		
		int miss_count = 0;

		long startTime = System.currentTimeMillis();
		
		System.out.println("Game Start!");
		for(int i = 0; i<item.length; i++) {
			System.out.print(keywords[item[i]] + " ❤️ ");
			String input = sc.nextLine();
			if (!input.equals(keywords[item[i]])) {
				miss_count++;
				System.out.println("Try again");
				i--;
			}
		}
		
		sc.close();
		
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time : " + ((endTime - startTime)/1000)+"sec");
		System.out.println("Miss Count : " + miss_count);
		
	}
}
