package banking.array;

import java.util.Scanner;

public class BankMain {
	static Account[] accounts = new Account[100];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true;

		while (sw) {
			System.out.println("=============================================");
			System.out.println("1.계좌생성 |2. 계좌목록 |3. 예금 | 4. 출금 | 5.종료 ");
			System.out.println("=============================================");
			System.out.println("선택>");

			// 메뉴선택
			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {

				getAccountList();
			} else if (selectNo == 3) {

				deposit();
			} else if (selectNo == 4) {

				withdraw();
			} else if (selectNo == 5) {
				sw = false;

			} else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			}

		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

	private static void createAccount() {
		System.out.println("---------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------------------------");

		System.out.print("계좌번호 입력 : ");
		String ano = scanner.nextLine();

		System.out.print("계좌주 입력 : ");
		String owner = scanner.nextLine();

		System.out.print("잔고 : ");
		int balance = Integer.parseInt(scanner.nextLine());

		// accounts[0] = new Account(ano, owner, balance);
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = new Account(ano, owner, balance);
				System.out.println("결과 : 계좌가 생성됐습니다.");
				break;
			} else if (accounts[i] == accounts[i]) {
				System.out.println("계좌가 중복되었습니다. 다시 입력해 주세요.");
				
			}
		}

	}

	private static void getAccountList() {
		System.out.println("-------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("-------------------------------------");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.print("계좌번호 : " + accounts[i].getAno() + "\t");
				System.out.print("계좌주 : " + accounts[i].getowner() + "\t");
				System.out.println("잔고 : " + accounts[i].getbalance());
			}
		}
	}

	private static void deposit() {
		System.out.println("-------------------------------------");
		System.out.println("입금 : ");
		System.out.println("-------------------------------------");

		System.out.print("계좌번호 입력 : ");
		String ano = scanner.nextLine();

		System.out.print("입금 : ");
		int money = Integer.parseInt(scanner.nextLine());

		if (findAccount(ano) != null) {
			Account account = findAccount(ano);
			account.setbalance(account.getbalance() + money);
			System.out.println("결과 : 정상 처리되었습니다.");
		} else {
			System.out.println("결과 : 계좌가 없습니다.");
		}
	}

	// 출금
	private static void withdraw() {
		System.out.println("-------------------------------------");
		System.out.println("출금 : ");
		System.out.println("-------------------------------------");

		System.out.print("계좌번호 입력 : ");
		String ano = scanner.nextLine();

		System.out.print("출금액 : ");
		int money = Integer.parseInt(scanner.nextLine());

		if (findAccount(ano) != null) {
			Account account = findAccount(ano);
			account.setbalance(account.getbalance() - money);
			System.out.println("결과 : 정상 처리되었습니다.");

		}


		else {
			System.out.println("결과 : 계좌가 없습니다.");
		}
	}

	// 계좌 검색
	private static Account findAccount(String ano) {
		Account account = null; // 찾을 계좌를 저장할 객체 변수 선언

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				String dbAno = accounts[i].getAno(); // 이미 생성된 계좌번호 가져옴
				if (dbAno.equals(ano)) { // 외부에서 입력한 찾는 계좌와 일치하면
					account = accounts[i]; // 일치하는 계좌를 저장함
					break;
				}
			}
		}

		return account;

	}

}
