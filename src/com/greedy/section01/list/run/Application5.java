package com.greedy.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

	public static void main(String[] args) {

		/* Queue
		 * Queue는 선형 메모리 공간에 데이터를 저장하는
		 * 선입선출(FIFO - First Input First Out) 방식의 자료구조이다.
		 * Queue는 인터페이스이기 때문에 직접 인스턴스를 생성하지 못하고
		 * 대부분 Queue는 LinkedList를 이용한다.
		 * */
//		Queue<String> que = new Queue<>(); //인터페이스여서 객체를 생성 못함
		
		Queue<String> que = new LinkedList<>();		//Queue는 LinkedList를 이용해야함
		
		/* 큐에 데이터를 넣을 때에 offer()를 이용한다. */
		que.offer("first");
		que.offer("second");
		que.offer("third");
		que.offer("fourth");
		que.offer("fifth");
		
		System.out.println(que);
		
		/* 큐에서 데이터를 꺼낼 때 2가지가 있다.
		 * peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환한다.
		 * poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거한다.
		 * */
		
		System.out.println("peek() : " + que.peek());
		System.out.println("peek() : " + que.peek());
		
		System.out.println(que);
		
		System.out.println("poll() : " + que.poll());
		System.out.println("poll() : " + que.poll());
		
		System.out.println(que);
	}

}
