package com.greedy.section01.list.run;

import java.util.Stack;

public class Application4 {

	public static void main(String[] args) {

		/* Stack
		 * Stack은 리스트 계열 클래스의 Vector 클래스를 상속받아 구현하였다.
		 * 후입선출(LIFO - Last Input First Out)방식의 자료구조가 불린다.
		 * */
		Stack<Integer> integerStack = new Stack<>();
		
		/* Stack에 값을 넣을 때 push()를 이용한다. */
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		integerStack.push(5);
		
		System.out.println(integerStack);
		
		/* 스택에서 요소를 찾을 때 search()를 이용할 수 있다. */
		System.out.println(integerStack.search(5));
		
		/* stack에서 값을 꺼내는 메소드는 크게 2가지로 볼 수 있다.
		 * peek() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환
		 * pop() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환 후 제거
		 * */
		System.out.println("peek() : " + integerStack.peek());
		System.out.println(integerStack); 		//반환을 했음에도 그대로 있음
		System.out.println("peek() : " + integerStack.peek());
		
		System.out.println("pop() : " + integerStack.pop());
		System.out.println(integerStack);		//반환을 해서 제거됨
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());	//EmptyStackException 발생
	}

}
