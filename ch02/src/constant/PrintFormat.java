package constant;

public class PrintFormat {

	public static void main(String[] args) {
		// printf("문자열 포맷", 객체(변수));
		// 대응 서식 : 정수 -%d, 실수 - %f, 문자 - %s
		// 줄바꿈 문자 \t, \n
		
		int year = 2023;
		System.out.println("올해는 " + year + "년 입니다.");
		System.out.printf("올해는 %d년 입니다.", year);
		
		float weight = 63.7F;
		System.out.println("무게는 "+ weight + "kg입니다.");
		System.out.printf("무게는 %.2f kg입니다.", weight);
		
		String nick = "얼음공주";
		System.out.printf("그녀의 별명은 %s다.", nick);
		
		// '\t' 사용
		//int num = 0;
		
		String table = "";
		table += "================\n";
		table += "이름\t나이\t나라\n";
		table += "강감찬\t82\t고려\n";
		table += "================\n";
		System.out.println(table);

	}

}
