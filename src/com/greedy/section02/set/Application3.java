package com.greedy.section02.set;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {

	public static void main(String[] args) {

		/* TreeSet 클래스
		 * 데이터를 이진 트리 형태로 요소를 저장한다.
		 * 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 느린 편 이지만
		 * 탐색 방법을 이용하여 자동 오름차순으로 데이터를 저장하게 된다.
		 * 또한 데이터를 탐색할 때 빠른 속도를 보인다.
		 * Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다.
		 * */
		Set<String> tset = new TreeSet<>();
		tset.add("java");
		tset.add("oracle");
		tset.add("jdbc");
		tset.add("html");
		tset.add("css");
		
		System.out.println(tset);
		
		/* 로또 번호 발생 */
		Set<Integer> lotto = new TreeSet<>();
		while(lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45) + 1);
		}
		
		System.out.println("lotto : " + lotto);
	}

}
