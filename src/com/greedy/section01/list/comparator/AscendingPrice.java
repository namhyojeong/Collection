package com.greedy.section01.list.comparator;

import java.util.Comparator;

import com.greedy.section01.list.dto.BookDTO;

public class AscendingPrice implements Comparator<BookDTO> {

	@Override
	public int compare(BookDTO o1, BookDTO o2) {

		/* sort()에서 내부적으로 사용하는 메소드이다.
		 * 인터페이스를 상속받아서 메소드 오버라이딩 하는 것을 강제화 해놓았다.
		 * */
		
		/* 비교 대상 두 인스턴스의 가격이 오름차순 정렬이 되기 위해서는
		 * 앞의 가격이 더 적은 가격이어야 한다.
		 * 만약 뒤의 가격이 더 작은 경우 두 인스턴스의 순서를 바꿔야 한다.
		 * 그 때 두 값을 바꾸라는 신호로 양수를 보내주게 되면 두 값을 바꿔준다.
		 * */
//		int result = 0;
//		
//		if(o1.getPrice() > o2.getPrice()) {
//			result = 1;			//값을 바꿔주기
//		} else if(o1.getPrice() < o2.getPrice()) {
//			result = -1;		//안바꿔도 됨
//		} else {
//			result = 0;			//두 값이 같으면 0을 반환
//		}
//		
//		return result;
		
		if(o1.getPrice() > o2.getPrice()) {
			return 1;			//값을 바꿔줘야하면 양수를 반환
		}
		
		return -1;
	}

}
