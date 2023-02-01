package com.greedy.section03.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {

		/* Map 인터페이스의 특징
		 * 
		 * Collection 인터페이스와는 다른 저장 방식을 가진다.
		 * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
		 * 키와 값 묶음을 엔트리(Entry) 라고 부른다.
		 * 
		 * 키(key)란?
		 * 값(value)를 찾기 위한 이름 역할을 하는 객체이다.
		 * 
		 * 1. 요소는 저장 순서를 유지하지 않는다.
		 * 2. 키는 중복을 허용하지 않는다. 키가 다르면 값은 중복되는 값을 저장할 수 있다.
		 * */
		
		Map hmap = new HashMap();
		hmap.put("one", new java.util.Date());
		hmap.put(12, 123);
		hmap.put(33, "red apple");
		
	    System.out.println(hmap); 			//저장 순서를 유지하지 않음
	    
	    /* 키는 중복 저장되지 않고 마지막에 저장한 값으로 덮어씀 */
	    hmap.put(12, "yellow banana");
	    
	    System.out.println(hmap);
	    
	    /* 값을 중복해서 저장할 수 있다. */
	    hmap.put(11, "yellow banana");
	    hmap.put(9, "yellow banana");
	    
	    System.out.println(hmap);
	    
	    System.out.println("키 9가 가지고 있는 값 : " + hmap.get(9));
	    
	    hmap.remove(9);
	    System.out.println(hmap);
	    
	    System.out.println("hmap에 저장된 요소 수 : " + hmap.size());
	    
	    Map<String, String> hmap2 = new HashMap<>();
	    hmap2.put("one", "java");
	    hmap2.put("two", "oracle");
	    hmap2.put("three", "jdbc");
	    hmap2.put("four", "html");
	    hmap2.put("five", "css");
	    
	    /* map 연속처리 */
	    /* 1. keySet()을 이용하면 키값만 따로 set으로 만들어서 반환한다. 
	     * iterator()로 키에 대한 목록 만들어서 연속 처리 
	     * */
//	    Set<String> keys = hmap2.keySet();
//	    System.out.println(keys);
//	    
//	    Iterator<String> keyIter = keys.iterator();
	    
	    Iterator<String> keyIter = hmap2.keySet().iterator();
	    while(keyIter.hasNext()) {
	    	String key = keyIter.next();
	    	String value = hmap2.get(key);
	    	
	    	System.out.println(key + " = " + value);
	    }
	    
	    /* 2. 저장된 value객체들만 values() 로 Collection으로 만듦 */
	    Collection<String> values = hmap2.values();
	    
	    Iterator<String> valueIter = values.iterator();
	    while(valueIter.hasNext()) {
	    	System.out.println(valueIter.next());
	    }
	    
	    Object[] valueArr = values.toArray();
	    for(int i = 0; i < valueArr.length; i++) {
	    	System.out.println(i + " : " + valueArr[i]);
	    }
	    
	    /* 3. Map의 내부클래스인 EntrySet 이용 */
	    Set<Map.Entry<String, String>> set = hmap2.entrySet();
	    
	    Iterator<Map.Entry<String, String>> entryIter = set.iterator();
	    while(entryIter.hasNext()) {
	    	Map.Entry<String, String> entry = entryIter.next();
	    	
	    	System.out.println(entry.getKey() + " : " + entry.getValue());
	    }
	}

}
