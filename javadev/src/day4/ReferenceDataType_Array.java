package day4;

import java.util.Arrays;

public class ReferenceDataType_Array {
	public static void main(String[] args) {
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 4;
		System.out.println(array1[0]);
		
		int[] array4;
		array4 = new int[]{1,2,4};
		System.out.println(Arrays.toString(array4));
		
		int[] array5 = {3,4,5};
		System.out.println(array5[0] + array5[1] +array5[2]);
		
		// 배열의 길이
		int len = array5.length;
		System.out.println(len);
	}
}
