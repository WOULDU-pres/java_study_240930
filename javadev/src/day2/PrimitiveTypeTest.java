package day2;
import java.math.BigDecimal;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		boolean b = true; // 1byte 할당, 1bit 사
		byte b2 = 127;
		System.out.println(b2);
		
		char c = 'a';
		System.out.println(c);
		char ASCII = 65;
		System.out.println(ASCII);
		
		short sh = 32767;
		
		long l = 24224242424L;
		double pi = 3.1415114;
		System.out.println();
		
		BigDecimal bd1 = new BigDecimal("2");
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));
		
	}

}
