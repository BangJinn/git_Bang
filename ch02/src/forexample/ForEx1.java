package forexample;

public class ForEx1 {

	public static void main(String[] args) {
		/*
		 for(초기값; 종료값; 증감값;){
		 실행문
		 }
		 */
		// 1~10 출력
		for(int i = 3;  i <= 27; i = i + 3) {
			System.out.println(i + " ");
		}
		//아스키 코드 값 알파벳 출력
		// 'A' - 65, 'a' - 97, 0 - 48
		char alpha = 'A';
		System.out.println(alpha);
		
		int val = 66;
		System.out.println((char)val);
		
		
		
		/*for(int num = 65; num <= 90; num++) {
			System.out.println((char)num);
		}*/
		
		for(char ch=65; ch<123; ch++) {
			System.out.println(ch + " ");
		}
		//한글 유니코드 값(12593 ~ 12684)
		for(char ch=12593; ch<12685; ch++) {
			System.out.print(ch + " ");
		}
		
		
	}

}
