package ifexample;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석의 줄(행)수
		// 변수 -customer(고객수), column(열 수), row(행 수)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객 수");
		int customer = sc.nextInt();
		
		System.out.print("좌석 열 수");
		int column = sc.nextInt();
		
		int row = 0;
		// 연산 처리 (if ~ else문)
		
		if(customer % column == 0 ){
			row = customer / column;
		}
		else{
			row = customer / column + 1;
		}
		
		System.out.println(row + "줄이 필요합니다.");
	
		sc.close();
	}
 
}
