package data;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - char, string
		// 복제 단축키 - alt + ctrl + 방향키 아래
		// ASCII(American Standard Code for ..)
		char alpha = 'A';
		System.out.println(alpha); 	//A
		System.out.println((int)alpha);	//65(아스키 코드값), 형변환한것
		
		int alpha2 = 66;
		
		System.out.println(alpha2); //66
		System.out.println((char)alpha2); //B
		
		//유니코드 - 16bit -2byte
		char uniCode1 = '한';
			System.out.println(uniCode1);
		
		char uniCode2 = '\uD55C';
			System.out.println(uniCode2);
				
		char uniCode3 = '\uAE00';
			System.out.println(uniCode3);
		}

}
