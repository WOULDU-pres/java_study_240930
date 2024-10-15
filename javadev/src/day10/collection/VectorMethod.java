package day10.collection;

import java.util.Vector;
import java.util.Arrays;
import java.util.List;

public class VectorMethod {
	public static void main(String[] args) {
			
		List<Integer> aList1 = new Vector<Integer>();
		

		// 1.add(E element)
		
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		
		
		// 2.add(int index, E element)

		aList1.add(1,6);
		System.out.println(aList1.toString());
		
		//3. addAll
		List<Integer> aList2 = new Vector<>();
		
		aList1.add(1);
		aList1.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2);
		
		
		//4. addAll
		List<Integer> aList3 = new Vector<>();

		aList3.add(1);
		aList3.add(2);
		aList2.addAll(1, aList3);
		System.out.println(aList2);
		
		
		//12. toArray() List -> Array
		Object[] object = aList3.toArray();
		System.out.println(Arrays.toString(object));
		
		
		
	}
}
