package day10.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {
	public static void main(String[] args) {
		Set<String> linkedSet1 = new LinkedHashSet<>();

		linkedSet1.add("GA");
		linkedSet1.add("NA");
		linkedSet1.add("GA");

		System.out.println(linkedSet1.toString());

		Set<String> linkedSet2 = new LinkedHashSet<>();

		linkedSet2.add("NA");
		linkedSet2.add("DA");

		System.out.println(linkedSet2.toString());

		linkedSet2.remove("NA");
		System.out.println(linkedSet2.toString());

		linkedSet2.clear();
		System.out.println(linkedSet2.toString());

		System.out.println(linkedSet2.isEmpty());

		Set<String> linkedSet3 = new LinkedHashSet<>();

		linkedSet3.add("GA");
		linkedSet3.add("NA");
		linkedSet3.add("DA");
		System.out.println(linkedSet3.contains("NA"));
		System.out.println(linkedSet3.contains("RA"));

		System.out.println(linkedSet3.size());

		Iterator<String> iterator = linkedSet3.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		Object[] objArray = linkedSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		

		Object[] strArray1 = linkedSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1));
		

		Object[] strArray2 = linkedSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));

	}
}
