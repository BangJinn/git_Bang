package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 업무
		// 1.예금 2.출금 3.잔고 4.종료
		//변수
		Scanner sc = new Scanner(System.in);
		int balance = 0; //잔고
		boolean sw = true;//상태변수
		//메뉴화면 만들기
	while(sw) {
		System.out.println("=====================================");
		System.out.println("| 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 |");
		System.out.println("=====================================");
		
		int selNum = sc.nextInt();	//메뉴 번호 입력
		
		switch(selNum) {
		case 1:
			System.out.println("예금액->");
			balance += sc.nextInt();
			break;
		case 2:
			System.out.println("출금액->");
			balance -= sc.nextInt();
			
			break;
		case 3:
			System.out.println("잔고는 " + balance + "원 입니다.");
			break;	
		case 4: 
			sw = false;	//트루에서 폴스로 바꿔서 와일문 종료
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
			break;
			}
	
		}
	System.out.println("프로그램 종료");
		
	}

}
