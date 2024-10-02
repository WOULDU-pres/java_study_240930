package day3;

public class ConditionalStatements_Switch {
	public static void main(String[] args) {
		int n = 99;
		
		String manOrWoman = switch(n) {
			case 1,3 -> "man";
			case 2,4 -> "woman";
			default -> "error";
		};
		System.out.println("String is : " + manOrWoman);
		System.out.println("종료");
	}
}
