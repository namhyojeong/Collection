package com.greedy.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {

	public static void main(String[] args) {

		/* LinkedList
		 * ArrayList가 배열을 이용하기 때문에 발생할 수 있는 성능적인 단점을 보완하고자 고안되었다.
		 * 내부는 이중 연결리스트로 구현되어 있다.
		 * */
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("orange");
		linkedList.add("mango");
		linkedList.add("grape");
		
		System.out.println(linkedList.size());
		
		int linkedListSize = linkedList.size();
		for(int i = 0; i < linkedListSize; i++) {
			System.out.println(i + " : " + linkedList.get(i));
		}
		
		linkedList.remove(1);
		
		for(String s : linkedList) {
			System.out.println(s);
		}
		
		linkedList.set(0, "fineapple");
		
		System.out.println("linkedList : " + linkedList);
		
		System.out.println(linkedList.isEmpty());
		
		linkedList.clear();
		
		System.out.println(linkedList.isEmpty());
	}

}
