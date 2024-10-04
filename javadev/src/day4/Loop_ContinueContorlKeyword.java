package day4;

public class Loop_ContinueContorlKeyword {

	public static void main(String[] args) {
		for(int i = 0; i< 10; i++) {
			for(int j = 0; j<5; j++) {
				if(j == 2) {
					continue;
				}
				System.out.println(i);
			}
		}
	}

}
