package day4;

public class ReferenceDataType_Array2 {
	public static void main(String[] args) {
		int[][] score = {
			{100,90,80,70},
			{100,90,80,70},
			{100,90,80,70}
		};
		

		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for (int row =0; row <score.length; row++) {
			int sum = 0;
			for (int col=0; col < score[row].length; col++) {
				System.out.print(score[row][col]+"\t");
				sum += score[row][col];
			}
			System.out.println(sum + "\t" + ((double) sum/score[row].length));
		}
	}
}
