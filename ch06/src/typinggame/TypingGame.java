package typinggame;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// 영어 단어가 랜덤하게 화면에 출제되면 타이핑하기
		// 일치하면 "통과", 일치하지 않으면 "다시도전"
		// 10문제 수행, 시간 측정
		
		String[] words = {"ant", "bear", "chicken", "cat", "dog", 
				"elephant", "frog", "horse", "monkey", "tiger"};
		
		Scanner sc = new Scanner(System.in);
		int n = 1;
		double start, end;
		System.out.println("영어타자 게임, 준비되면 엔터");
		sc.nextLine();
		start = System.currentTimeMillis();
		
		while(n < 11) {
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제" + n);
			String qusetion = words[rand];
			System.out.println(qusetion);	//출제된 단어
			//단어 입력
			String answer = sc.nextLine();	//사용자 입력
			
			if(answer.equals(qusetion)) {
				System.out.println("통과!");
				n++;
			}else {
					System.out.println("다시 도전!");
				
			}
		}
		end = System.currentTimeMillis();
		System.out.printf("클리어 타임 %.2f초입니다.\n " , (end - start)/1000);
		
		sc.close();
	}

}