package ifexample;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {
		// 점수에 따른 학점 출력 프로그램
		// 변수 - score(정수형), grade(문자형)
		// A학점 - 90 ~ 100
		// B학점 - 80 ~ 89
		// C학점 - 70 ~ 79
		// D학점 - 60 ~ 69
		// F학점 - 0 ~ 59
		// 객체(변수) scan생성
		Scanner scan = new Scanner(System.in);
		
		
		//입력
		System.out.print("점수를 입력하세요.");
		int score = scan.nextInt();
		char grade = 'A';	//char형은 한 문자라서 ''를 씀.
		
		//연산
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80 && score <= 89) {
			grade = 'B';
		}else if(score >= 70 && score <= 79) {
			grade = 'C';
		}else if(score >= 60 && score <= 69) {
			grade = 'D';
		}else{	//else if(score >= 0 && score <= 59
			grade = 'F';
		}
	
		
		//출력
		System.out.println(grade + " 학점 입니다.");
		scan.close();
		
	}

}
