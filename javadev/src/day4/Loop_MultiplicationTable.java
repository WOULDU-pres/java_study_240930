package day4;

public class Loop_MultiplicationTable {
	public static void main(String[] args) {
		for(int start = 2; start<=6; start+=4) {
			for(int j = 2; j<=9; j++) {
				for(int i = start; i<=start+3; i++) {
					System.out.print(i+"x"+j+"="+j*i+"\t");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}
}
