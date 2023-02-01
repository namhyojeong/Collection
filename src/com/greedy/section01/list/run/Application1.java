package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {

		/* 컬렉션 프레임워크(Collection Framework) 
		 * 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록 표준화된 방법을 제공하는 클래스들의 집합이다.
		 * 즉, 데이터를 효율적으로 저장하는 자료구조와, 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스를 말한다.
		 * 
		 * 1. List 인터페이스
		 *  - 순서가 있는 데이터의 집합으로 데이터의 중복 저장을 허용한다.
		 *  - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
		 * 2. Set 인터페이스
		 *  - 순서가 없는 데이터의 집합으로 데이터 중복을 허용하지 않는다.
		 *  - HashSet, TreeSet 등이 있다.
		 * 3. Map 인터페이스
		 *  - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
		 *  - key를 set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용하지 않는다.
		 *    단, value는 중복된 값을 저장할 수 있다.
		 *  - HashMap, TreeMap, HashTable, Properties 등이 있다.
		 * 
		 * List와 Set은 공통 부분을 Collection 인터페이스에서 정의하고 있다.
		 * */
		
		/* ArrayList
		 * JDK 1.2부터 제공되는 가장 많이 사용되는 컬렉션 클래스이다.
		 * 내부적으로 배열을 이용하여 요소를 관리하며 인덱스를 이용해 배열의 요소에 접근한다.
		 * ArrayList는 객체 배열의 단점을 보완하기 위해 만들어졌다.
		 * 배열의 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
		 * ArrayList는 크기 변경, 요소의 추가, 삭제, 정렬 기능을 미리 구현해놓고 제공해주고 있다.
		 * (자동으로 수행되는 것이지 속도가 빨라지는 것은 아니다)
		 * */
		
		/* ArrayList는 인스턴스를 생성하게 되면 내부적으로 10칸짜리 배열을 생성해서 관리한다. */
		ArrayList alist = new ArrayList();

		/* 다형성을 적용하여 상위 타입으로 ArrayList 객체를 만든다.
		 * List 인터페이스 하위의 다양한 구현체들로 타입변경이 가능하기 때문에
		 * 레퍼런스 타입은 List로 해두는 것이 더 유연하게 코드를 작성하는 것이다.
		 * */
		List list = new ArrayList();
//		list = new LinkedList(list);
		
//		Collection clist = new ArrayList();
		
		list.add("apple");
		list.add(123);
		list.add(45.67);
		list.add(new java.util.Date());
		
		System.out.println(list.get(0));
		
		System.out.println("list : " + list);
		
		System.out.println("list의 size() : " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		list.add("apple");
		System.out.println("list : " + list);
		
		list.add(1, "banana");
		System.out.println("list : " + list);
		
		list.remove(2);
		System.out.println("list : " + list);
		
		list.set(1, true);
		System.out.println("list : " + list);
		
		/* 모든 컬렉션 프레임워크 클래스들은 제네릭 클래스로 작성되어 있다. */
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
//		stringList.add(123);
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("mango");
		stringList.add("grape");
		
		System.out.println("stringList : " + stringList);
		
		/* Collection 인터페이스의 부가적인 기능들을 static 메소드 형태로 제공하는 유틸성 클래스 
		 * 1.8 이하에서는 인터페이스에서 일반 메소드를 가질 수 없었기 때문에,
		 * 인터페이스에서 필요하는 기능을 세트로 작성해놓는 클래스의 명칭 관례상 s가 붙는다.
		 * */
		Collections.sort(stringList);
		
		System.out.println("stringList sort : " + stringList);
		
		stringList = new LinkedList<>(stringList);
		
		/* Iterator란?
		 * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성한다.
		 * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
		 * 반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
		 * 인덱스로 관리되는 컬렉션이 아닌 경우 반복문을 사용할 수 있는 방법이 존재하지 않기 때문에
		 * 요소에 하나씩 접근하기 위한 통일된 방식을 제공하는 것이다.
		 * 
		 * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false를 반환
		 * next() : 다음 요소를 반환
		 * */
		Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
//		while(dIter.hasNext()) {
//			System.out.println(dIter.next());
//		}
//		while(dIter.hasNext()) {
//			System.out.println(dIter.next());
//		}
		
		List<String> descList = new ArrayList<>();
		while(dIter.hasNext()) {
			descList.add(dIter.next());
		}
		
		System.out.println("descList : " + descList);
	}

}
