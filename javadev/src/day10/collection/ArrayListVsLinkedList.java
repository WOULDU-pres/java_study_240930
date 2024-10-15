package day10.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {	
	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
		
		//1-1 ArrayList 데이터 추가 시간
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			arrayList.add(0, i);
		}
		
		endTime = System.nanoTime()	;
		System.out.println("ArrayList 데이터 추가 시간 = " + (endTime - startTime));
		
		//1-2 LinkedList 데이터 추가 시간
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedList.add(0, i);
		}
		
		endTime = System.nanoTime()	;
		System.out.println("LinkedList 데이터 추가 시간 = " + (endTime - startTime));
		
		//2-1 ArrayList 데이터 추가 시간
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			arrayList.get(i);
		}
		
		endTime = System.nanoTime()	;
		System.out.println("ArrayList 데이터 검색 시간 = " + (endTime - startTime));
		
		//2-2 LinkedList 데이터 추가 시간
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedList.get(i);
		}
		
		endTime = System.nanoTime()	;
		System.out.println("LinkedList 데이터 검색 시간 = " + (endTime - startTime));
		
		//3-1 ArrayList 데이터 추가 시간
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			arrayList.remove(0);
		}
		
		endTime = System.nanoTime()	;
		System.out.println("ArrayList 데이터 제거 시간 = " + (endTime - startTime));
		
		//3-2 LinkedList 데이터 추가 시간
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedList.remove(0);
		}
		
		endTime = System.nanoTime()	;
		System.out.println("LinkedList 데이터 제거 시간 = " + (endTime - startTime));
	}

}
