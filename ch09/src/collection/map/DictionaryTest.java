package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

	public static void main(String[] args) {

		Map<String, String> dic = new HashMap();
		
		dic.put("이진수", "컴퓨터가 사용하는 0과 1만으로 이루어진 수");
		dic.put("알고리즘", "어떤 문제를 해결하기 위해 정해진 절차");
		dic.put("버그", "프로그램이 적절하게 동작하는데");
		dic.put("깃허브", "짱짱 웹 서비스");
		
		System.out.println("==============================================");
		System.out.println("프로그램을 종료하려면 Q 또는 q를 입력하고 엔터를 누르세요");
		System.out.println("==============================================");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 단어를 입력하세요");
			String word = scanner.nextLine();
			
			if(word.toLowerCase().equals("q")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			String definition = dic.get(word);
			if(definition != null) {
			System.out.println(definition);
			break;
			}else {
				System.out.println(word + "는 없는 단어입니다.");
				
			}
		
		}
		scanner.close();
		
		
		
		
		
	}

}
