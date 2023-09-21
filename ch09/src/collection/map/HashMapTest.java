package collection.map;

//한번에 인풋 하는법 컨트롤 쉬프트 O
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("이순신", 95);
		map.put("양만춘", 87);
		map.put("강감찬", 79);
		
		System.out.println(map.get("양만춘"));
		
		if(map.containsKey("강감찬")) {
			map.remove("강감찬");
		}
		
		
		System.out.println("총 객체 수 : " + map.size());
		
		Set<String> keySet = map.keySet();
		Iterator<String> ir = keySet.iterator();
		while(ir.hasNext()) {	//객체 수만큼 반복
			String key = ir.next();	//객체가 있으면 1개씩 가져옴
			Integer value = map.get(key);	//키를 매개로 값을 가져옴
			System.out.println(key + " : " + value);
			
		}
		
		//조회2
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
			
		}
		
		System.out.println(map);
		
		
	}

}
