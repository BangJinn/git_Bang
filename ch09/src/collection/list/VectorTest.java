package collection.list;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		List<String> vegeList = new Vector<>();
		
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		if(vegeList.contains("양파")) {
			vegeList.remove("양파");
		}
		
		System.out.println("총 객체 수 : " + vegeList.size());
		
		for(String vege : vegeList)
			System.out.println(vege);
		
	}

}
