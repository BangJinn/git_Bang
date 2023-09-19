package stringmethod;

public class StringMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World Hello";
		
		int val = str.indexOf("Hello");
		System.out.println(val);
		
		int val2 = str.lastIndexOf("Hello");
		System.out.println(val2);
		
		int val3 = str.indexOf("ok");
		System.out.println(val3);
		
		String subject = "자바 프로그래밍";
		if(subject.indexOf("자바") != -1) {	//자바가 검색이 되면
			System.out.println("자바와 관련된 책이군요!");
		}else {	//index == -1
			System.out.println("자바와 관련 없는 책이군요!");
		}
		
		
	}

}
