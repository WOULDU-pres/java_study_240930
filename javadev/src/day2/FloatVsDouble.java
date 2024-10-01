package day2;

public class FloatVsDouble {
	public static void main(String[] args) {
		//float의 정밀도(소수 7자리)
		float f1 = 1.0000001f;
		float f2 = 1.00000001f;
		
		System.out.println(f1);
		System.out.println(f2);
		
		//double의 정밀도(소수 15자리)
		double d1 = 1.000000000000001d;
		double d2 = 1.0000000000000001d;
		System.out.println(d1);
		System.out.println(d2);
	}
}
