package threads.synchronize;

public class SynchronizeTest {

	public static void main(String[] args) {
		//공유객체 생성
		Calculator calculator = new Calculator();
		//유저1 스레드 객체 생성
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		//유저2 스레드 객체 생성
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
		
		
	}

}
