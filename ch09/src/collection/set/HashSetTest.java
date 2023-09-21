package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		//set 인터페이스를 구현한 HashSet 클래스 객체 생성
		//순서가 없고, 중복 데이터를 허용하지않음.
		Set<String> set = new HashSet<>();
		
		//객체 생성
		set.add("Java");
		set.add("Jdbc");
		set.add("Jsp");
		set.add("Java");
		
		//객체 수 확인
		System.out.println("객체 수 : " + set.size());
		
		//삭제
		if(set.contains("Jsp")) {
			set.remove("Jsp");
		}
		
		System.out.println("객체 수 : " + set.size());
		
		//전체 목록 조회
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			
		}
		
		System.out.println("==============");
		for(String element : set)
		System.out.println(element);
		
	}

}
