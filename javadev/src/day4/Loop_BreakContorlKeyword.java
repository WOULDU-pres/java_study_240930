package day4;

public class Loop_BreakContorlKeyword {
	
	public static void main(String[] args) {
		for(int i = 0; i< 10; i++) {
			for(int j = 0; j<5; j++) {
				if(j == 2) {
					i = 100;
					break;
				}
				System.out.println(i);
			}
		}
	}

}
