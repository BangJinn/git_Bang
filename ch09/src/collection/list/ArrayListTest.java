package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		//String 자료형으로 데이터 관리(CRUD)
		List<String> vegeList = new ArrayList<>();		
		//자료 생성(추가)
		vegeList.add("양파");	//0번 인덱스에 저장
		vegeList.add("마늘");	//1번 인덱스에 저장
		vegeList.add("감자");	//2번 인덱스에 저장
		vegeList.add("양파");	//2번 인덱스에 저장
		
		//특정 자료 조회해보자~
		System.out.println(vegeList.get(1));
		//리스트 객체의 개수
		System.out.println("총 객체 수 : " + vegeList.size());
		
		//객체수정
		vegeList.set(2, "상추");
		
		//객체 삭제(Delete: remove())
		if(vegeList.contains("마늘"))
			vegeList.remove("마늘");
		
		
		for(int i = 0; i < vegeList.size(); i++) {
			String vege = vegeList.get(i);
			System.out.println(vege);
			
			
			
		}
		
		
	}
}
